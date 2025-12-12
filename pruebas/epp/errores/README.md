# Casos de Error - E++

Esta carpeta contiene archivos de prueba que deben generar errores durante la compilación.

## Errores Léxicos

### `error_lexico_caracter_invalido.txt`
- **Error:** Caracter no válido `@` en expresión aritmética
- **Tipo:** Léxico
- **Resultado esperado:** El lexer debe reportar token no reconocido

## Errores Sintácticos

### `error_sintactico_falta_fin.txt`
- **Error:** Falta la palabra clave `fin` al final del programa
- **Tipo:** Sintáctico
- **Resultado esperado:** Error de parsing, programa incompleto

### `error_sintactico_expresion_incompleta.txt`
- **Error:** Asignación sin expresión del lado derecho
- **Tipo:** Sintáctico
- **Resultado esperado:** Error de parsing en regla de asignación

### `error_sintactico_parentesis.txt`
- **Error:** Paréntesis abierto sin cerrar
- **Tipo:** Sintáctico
- **Resultado esperado:** Error de parsing, paréntesis sin emparejar

## Errores Semánticos

### `error_semantico_variable_no_declarada.txt`
- **Error:** Uso de variable `x` sin declaración previa
- **Tipo:** Semántico
- **Resultado esperado:** Variable 'x' no ha sido declarada

### `error_semantico_uso_antes_declaracion.txt`
- **Error:** Uso de variable `z` antes de su declaración
- **Tipo:** Semántico
- **Resultado esperado:** Variable 'z' no ha sido declarada

### `error_semantico_division_cero.txt`
- **Error:** División literal por cero (100 / 0)
- **Tipo:** Semántico
- **Resultado esperado:** División por cero detectada

### `error_semantico_multiples_variables.txt`
- **Error:** Múltiples variables no declaradas (`a`, `b`, `c`)
- **Tipo:** Semántico
- **Resultado esperado:** Tres errores de variables no declaradas

## Uso

Para probar cada archivo de error, ejecuta:

```bash
# Compilar el proyecto
cd compilador
mvn clean package

# Ejecutar con un archivo de error
java -jar target/compilador-1.0-SNAPSHOT.jar
# Cuando pida la ruta, ingresa: ../pruebas/epp/errores/error_semantico_variable_no_declarada.txt
```

El compilador debe detectar y reportar el error apropiadamente sin generar código .j
