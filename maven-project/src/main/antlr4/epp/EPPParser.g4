parser grammar EPPParser;

@header { package epp; }

options { tokenVocab = EPPLexer; language = Java; }

// --------------------------------------------------------------------
// PARSER
// --------------------------------------------------------------------

/*
 * Regla principal que representa un programa completo.
 * Un programa puede contener múltiples instrucciones o comentarios,
 * y termina con el final del archivo (EOF).
 */
programa
    : (instruccion | comentario)* EOF
    ;

/*
 * Regla que define las posibles instrucciones en el programa.
 * Las instrucciones pueden ser asignaciones, mostrar valores,
 * condicionales, leer valores o bucles mientras.
 */
instruccion
    : asignacion
    | mostrar
    | condicional
    | leer
    | mientras
    ;

/*
 * Regla para la instrucción de asignación.
 * Permite asignar un valor a una variable usando la palabra clave 'asignar'.
 * Ejemplo: asignar x = 5;P
 */
asignacion
    : ASIGNAR VARIABLE ASIGNACION expresion FINLINEA
    ;

/*
 * Regla para la instrucción de mostrar.
 * Permite imprimir una expresión en la salida.
 * Ejemplo: mostrar "Hola, mundo";P
 */
mostrar
    : MOSTRAR expresion FINLINEA
    ;

/*
 * Regla para la instrucción de leer.
 * Permite leer un valor y asignarlo a una variable.
 * Ejemplo: leer x;P
 */
leer
    : LEER VARIABLE FINLINEA
    ;

/*
 * Regla para la instrucción mientras.
 * Define un bucle que se ejecuta mientras una expresión booleana sea verdadera.
 * Solo acepta expresiones de comparación o literales booleanos.
 * Ejemplo:
 * mientras (x < 10) ->
 *   mostrar x;P
 * terminar
 */
mientras
    : MIENTRAS PARENIZQ expresionBooleana PARENDER FLECHA bloque TERMINAR
    ;

/*
 * Regla para la instrucción condicional.
 * Permite ejecutar un bloque de código si una expresión booleana es verdadera,
 * con una opción para un bloque alternativo si es falsa.
 * Solo acepta expresiones de comparación o literales booleanos.
 * Ejemplo:
 * x > 5 ???
 * si ->
 *   mostrar "Mayor";P
 * no ->
 *   mostrar "Menor o igual";P
 * terminar
 */
condicional
    : expresionBooleana CONDICION
      SI FLECHA bloque
      (NO FLECHA bloque)?
      TERMINAR
    ;

/*
 * Regla para un bloque de código.
 * Un bloque puede contener múltiples instrucciones o comentarios.
 * Puede estar vacío (se ejecuta pero no hace nada).
 */
bloque
    : (instruccion | comentario)*
    ;

/*
 * Regla para los comentarios.
 * Los comentarios comienzan con '#' y terminan al final de la línea.
 * Ejemplo: # Esto es un comentario
 */
comentario
    : COMENTARIO
    ;

// --------------------------------------------------------------------
// EXPRESIONES (con precedencia correcta - recursión izquierda)
// --------------------------------------------------------------------

/*
 * Regla para expresiones booleanas.
 * Solo para usar en condicionales y bucles.
 * Permite:
 * - Operadores lógicos: y, o
 * - Negación: no_es
 * - Comparaciones entre expresiones aritméticas (números)
 * - Comparaciones entre strings
 * - Comparaciones entre variables
 * - Literales booleanos (verdadero/falso)
 * Precedencia: OR < AND < NOT < Comparaciones
 */
expresionBooleana
    : expresionBooleana O_LOGICO expresionBooleana                  # ExprBooleanaOr
    | expresionBooleana Y_LOGICO expresionBooleana                  # ExprBooleanaAnd
    | NO_LOGICO expresionBooleana                                   # ExprBooleanaNot
    | expresionComparable operadorComparacion expresionComparable   # ExprBooleanaComparacion
    | VERDADERO                                                      # ExprBooleanaVerdadero
    | FALSO                                                          # ExprBooleanaFalso
    | PARENIZQ expresionBooleana PARENDER                            # ExprBooleanaParentesis
    ;

/*
 * Expresiones que se pueden comparar:
 * - Expresiones aritméticas (números)
 * - Strings
 * - Variables (pueden contener cualquier tipo)
 */
expresionComparable
    : expresionAritmetica  # ExprCompAritmetica
    | STRING               # ExprCompString
    ;

/*
 * Regla para las expresiones (genéricas).
 * Usada en asignaciones y mostrar.
 * Precedencia (de menor a mayor):
 * 1. Comparación (==, !=, <, >, <=, >=)
 * 2. Aditivos (+, -)
 * 3. Multiplicativos (*, /, %)
 * 4. Primarias (variables, números, strings, booleanos, paréntesis)
 */
expresion
    : expresion operadorComparacion expresion     # ExprComparacion
    | expresion operadorAditivo expresion         # ExprAritmeticaSumaResta
    | expresion operadorMultiplicativo expresion  # ExprAritmeticaMultDiv
    | expresionPrimaria                           # ExprPrimaria
    ;

/*
 * Regla para expresiones aritméticas.
 * Solo operaciones numéricas, sin comparaciones ni booleanos.
 */
expresionAritmetica
    : expresionAritmetica operadorAditivo expresionAritmetica         # ExprAritSumaResta
    | expresionAritmetica operadorMultiplicativo expresionAritmetica  # ExprAritMultDiv
    | expresionAritmeticaPrimaria                                     # ExprAritPrimaria
    ;

/*
 * Expresiones aritméticas primarias: solo valores numéricos y variables.
 */
expresionAritmeticaPrimaria
    : VARIABLE                                    # ExprAritVariable
    | NUM                                         # ExprAritNumero
    | PARENIZQ expresionAritmetica PARENDER       # ExprAritParentesis
    ;

/*
 * Expresiones primarias: valores literales, variables y expresiones
 * entre paréntesis.
 */
expresionPrimaria
    : VARIABLE                                    # ExprVariable
    | NUM                                         # ExprNumero
    | STRING                                      # ExprTexto
    | VERDADERO                                   # ExprBooleanoVerdadero
    | FALSO                                       # ExprBooleanoFalso
    | PARENIZQ expresion PARENDER                 # ExprParentesis
    ;

/*
 * Regla para los operadores de comparación.
 * Incluye operadores como >, <, ==, !=, >=, <=.
 */
operadorComparacion
    : MAYOR | MENOR | IGUAL | DIFERENTE | MAYORIGUAL | MENORIGUAL
    ;

/*
 * Regla para los operadores aditivos.
 * Incluye suma (+) y resta (-).
 */
operadorAditivo
    : MAS | MENOS
    ;

/*
 * Regla para los operadores multiplicativos.
 * Incluye multiplicación (*), división (/) y módulo (%).
 */
operadorMultiplicativo
    : POR | DIV | MOD
    ;
