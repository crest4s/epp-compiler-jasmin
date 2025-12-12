# Documentación Técnica - Decisiones de Diseño

## Lenguaje E++

### Características Principales

El lenguaje E++ es un lenguaje imperativo simple diseñado con las siguientes características:

#### 1. **Tipos de Datos**
- **Enteros (INT)**: Números enteros con soporte para operaciones aritméticas
- **Cadenas (STRING)**: Texto entre comillas dobles
- **Booleanos (BOOL)**: Valores `verdadero` y `falso`

#### 2. **Operadores Aritméticos**
- Suma: `+`
- Resta: `-`
- Multiplicación: `*`
- División: `/`
- Módulo: `%`

**Decisión de diseño:** Se implementaron todos los operadores aritméticos comunes para permitir expresiones matemáticas completas. La precedencia sigue el estándar matemático (multiplicación/división/módulo antes que suma/resta).

#### 3. **Operadores Lógicos**
- AND: Conjunción lógica
- OR: Disyunción lógica
- NOT: Negación lógica

**Decisión de diseño:** Los operadores lógicos permiten construir expresiones booleanas complejas necesarias para condicionales y bucles.

#### 4. **Operadores de Comparación**
- Mayor que: `>`
- Menor que: `<`
- Igual a: `==`
- Diferente de: `!=`
- Mayor o igual: `>=`
- Menor o igual: `<=`

#### 5. **Estructuras de Control**

**Condicionales (si/no):**
```
si (condicion) ->
    instrucciones
no ->
    instrucciones
terminar
```

**Bucle mientras:**
```
mientras (condicion) ->
    instrucciones
terminar
```

**Bucle para:**
```
para variable desde inicio hasta fin paso incremento ->
    instrucciones
terminar
```

**Decisión de diseño:** Se eligió una sintaxis con flechas (`->`) para delimitadores de bloques y la palabra `terminar` para el cierre, haciéndola más legible que llaves o indentación estricta.

#### 6. **Variables**

- Declaración implícita mediante asignación
- Sintaxis: `asignar variable = expresion;P` o `variable = expresion;P`
- No requiere declaración de tipos (inferencia de tipos)

**Decisión de diseño:** La declaración implícita simplifica la sintaxis y hace el lenguaje más accesible. El punto y coma seguido de `P` (`;P`) marca el fin de instrucción de forma visible.

#### 7. **Entrada/Salida**

- **mostrar**: Imprime valores por consola
- **leer**: Lee un entero desde la entrada estándar

```
mostrar "Texto" ;P
mostrar variable ;P
leer variable ;P
```

---

## Tabla de Símbolos

### Implementación

La tabla de símbolos (`SymbolTable.java`) gestiona:

1. **Registro de variables**: Cada variable se registra con:
   - Nombre
   - Índice de variable local de Jasmin
   - Tipo (INT, STRING, BOOLEAN, UNKNOWN)

2. **Asignación automática de índices**: Las variables se asignan a posiciones de memoria local automáticamente (`locals[1]`, `locals[2]`, etc.), reservando `locals[0]` para los argumentos del método `main`.

3. **Inferencia de tipos básica**: El sistema intenta inferir el tipo basándose en el valor asignado (número, string, booleano).

### Decisiones de Diseño

- **Scope único y global**: Todas las variables están en el mismo ámbito (simplificación pedagógica)
- **Sin redeclaración**: Una vez declarada una variable, no se puede redeclarar
- **Índices automáticos**: Evita errores manuales en la gestión de locals de Jasmin

---

## Gestión de Errores

### Tipos de Errores Detectados

#### 1. **Errores Léxicos**
- Caracteres no reconocidos
- Tokens malformados

**Ejemplo:** Usar `@` como operador

#### 2. **Errores Sintácticos**
- Estructura gramatical incorrecta
- Paréntesis sin emparejar
- Falta de delimitadores (`terminar`, `fin`)

**Ejemplo:**
```
asignar x = 
```

#### 3. **Errores Semánticos**
- **Variable no declarada**: Uso de variable antes de su declaración/inicialización
- **División por cero**: División o módulo por cero literal

**Implementación:** `EPPSemanticListener.java`

- Utiliza un `Set<String>` para rastrear variables declaradas
- Recorre el AST antes de la generación de código
- Acumula todos los errores antes de reportar
- Detiene la compilación si hay errores

### Flujo de Detección

```
Código fuente
    ↓
Análisis Léxico (ANTLR) → Errores léxicos
    ↓
Análisis Sintáctico (ANTLR) → Errores sintácticos
    ↓
Análisis Semántico (Listener) → Errores semánticos
    ↓
Generación de Código (Visitor) → Código Jasmin
```

---

## Generación de Código Jasmin

### Estrategia General

El `EPPToJasminVisitor.java` traduce el AST de E++ a bytecode Jasmin siguiendo el patrón Visitor.

#### Estructura de Clase Generada

```jasmin
.class public NombrePrograma
.super java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
    .limit stack <calculado>
    .limit locals <calculado>
    
    ; código generado
    
    return
.end method
```

### Gestión de Stack

- **pushStack(n)**: Incrementa contador de pila al agregar elementos
- **popStack(n)**: Decrementa contador al consumir elementos
- **maxStack**: Rastrea el máximo tamaño de pila necesario

**Decisión de diseño:** El cálculo automático de `.limit stack` evita errores de verificación de bytecode.

### Traducción de Construcciones

#### Asignaciones
```
asignar x = 5;P
```
→
```jasmin
bipush 5
istore_1  ; x está en locals[1]
```

#### Operaciones Aritméticas
```
x + y
```
→
```jasmin
iload_1   ; cargar x
iload_2   ; cargar y
iadd      ; sumar
```

#### Condicionales
```
si (x > 5) ->
    mostrar x;P
terminar
```
→
```jasmin
iload_1
bipush 5
if_icmple else_0
    ; bloque then
    goto end_if_0
else_0:
end_if_0:
```

#### Bucles Mientras
```
mientras (x < 10) ->
    x = x + 1;P
terminar
```
→
```jasmin
while_start_0:
iload_1
bipush 10
if_icmpge while_end_0
    ; cuerpo del bucle
    goto while_start_0
while_end_0:
```

#### Bucles Para
```
para i desde 0 hasta 10 paso 1 ->
    mostrar i;P
terminar
```
→
```jasmin
iconst_0
istore_1     ; i = 0
for_start_0:
iload_1
bipush 10
if_icmpge for_end_0
    ; cuerpo
    iload_1
    iconst_1
    iadd
    istore_1  ; i = i + 1
    goto for_start_0
for_end_0:
```

### Optimizaciones Aplicadas

1. **Uso de instrucciones cortas**: `iconst_0`, `bipush`, `sipush` según rango del número
2. **Labels únicos**: Contador global para evitar colisiones de etiquetas
3. **Gestión eficiente de locals**: Reutilización de índices para variables

---

## Pipeline de Compilación

### Fases

1. **Entrada**: Archivo `.txt` con código E++
2. **Análisis Léxico**: Genera tokens
3. **Análisis Sintáctico**: Construye AST
4. **Análisis Semántico**: Valida semántica
5. **Generación de Código**: Produce archivo `.j`
6. **Compilación Jasmin**: `.j` → `.class`
7. **Ejecución**: JVM ejecuta `.class`

### Herramientas Utilizadas

- **ANTLR 4.13.2**: Generación de lexer/parser
- **Java 25**: Lenguaje de implementación
- **Maven**: Gestión de dependencias y build
- **Jasmin 2.4**: Assembler de bytecode JVM

---

## Casos de Prueba

### Pruebas Básicas
- Asignaciones simples
- Operaciones aritméticas
- Condicionales
- Entrada/salida

### Pruebas Avanzadas
- Bucles anidados
- Expresiones booleanas complejas
- Combinación de estructuras de control

### Pruebas de Errores
- Variables no declaradas
- Errores sintácticos
- División por cero

---

## Limitaciones Conocidas

1. **Sin funciones definidas por el usuario**: Solo existe `main`
2. **Sin arrays ni estructuras de datos complejas**
3. **Scope global único**: No hay bloques con scope local
4. **Tipos no estrictos**: La verificación de tipos es limitada
5. **Entrada solo de enteros**: `leer` solo lee int

---

## Conclusiones

El compilador E++ logra:

✅ Análisis completo (léxico, sintáctico, semántico)
✅ Generación de código Jasmin funcional
✅ Soporte para estructuras de control completas
✅ Detección de errores en múltiples niveles
✅ Pipeline de compilación end-to-end

El diseño prioriza la claridad y facilidad de extensión sobre la eficiencia, haciéndolo ideal como proyecto educativo.
