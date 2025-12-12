# Guía de Uso - Compilador E++

## Requisitos Previos

- Java JDK 17 o superior
- Maven 3.6+
- Jasmin 2.4 (incluido en `jasmin/herramientas/jasmin-2.4/`)

## Compilación del Proyecto

```bash
cd compilador
mvn clean package
```

Esto genera:
- `target/maven-project-1.0-SNAPSHOT.jar`
- `target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar`

## Uso del Compilador E++

### 1. Compilar un archivo E++

```bash
java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

El programa solicitará la ruta del archivo:
```
Introduce la ruta completa del archivo E++ (ej. C:\ruta\programa.txt):
```

Ejemplo:
```
/ruta/completa/pruebas/epp/basico/E++.txt
```

### 2. Salida

Si la compilación es exitosa:
```
Compilación exitosa
  Entrada: /ruta/programa.txt
  Salida: /ruta/programa.j
```

Si hay errores:
```
Compilación fallida: Se encontraron errores semánticos.

=== ERRORES SEMÁNTICOS ENCONTRADOS ===
  • Error semántico [Línea 4:8] Variable 'x' no ha sido declarada
Total: 1 error(es)
```

### 3. Compilar con Jasmin

```bash
cd /ruta/donde/esta/el/archivo
java -jar /ruta/a/jasmin/herramientas/jasmin-2.4/jasmin.jar programa.j
```

Esto genera `programa.class`

### 4. Ejecutar el programa

```bash
java programa
```

## Ejemplo Completo

```bash
# 1. Compilar el compilador
cd compilador
mvn clean package

# 2. Compilar un programa E++
echo "/Users/usuario/compiladores-pl3/pruebas/epp/jasmin/Prueba_BuclePara.txt" | \
  java -cp target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain

# 3. Compilar con Jasmin
cd ../pruebas/epp/jasmin
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar Prueba_BuclePara.j

# 4. Ejecutar
java Prueba_BuclePara
```

## Uso del Conversor CSV → JSON

```bash
java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar csv.CSVMain
```

Solicita la ruta del archivo CSV:
```
Introduce la ruta del archivo CSV: pruebas/csv/CSV_01.txt
```

Genera:
```
CSV → JSON completado con éxito.
  Entrada: pruebas/csv/CSV_01.txt
  Salida: pruebas/csv/CSV_01_salida.json
```

## Sintaxis del Lenguaje E++

### Variables y Asignación

```
asignar x = 10;P
y = 20;P
```

### Operaciones Aritméticas

```
suma = x + y;P
resta = x - y;P
multiplicacion = x * y;P
division = x / y;P
modulo = x % y;P
```

### Condicionales

```
si (x > 10) ->
    mostrar "Mayor que 10";P
no ->
    mostrar "Menor o igual que 10";P
terminar
```

### Bucle Mientras

```
contador = 0;P
mientras (contador < 5) ->
    mostrar contador;P
    contador = contador + 1;P
terminar
```

### Bucle Para

```
para i desde 0 hasta 10 paso 1 ->
    mostrar i;P
terminar
```

### Entrada/Salida

```
mostrar "Ingrese un número:";P
leer x;P
mostrar x;P
```

### Expresiones Booleanas

```
a = verdadero;P
b = falso;P

si (a AND b) ->
    mostrar "Ambos verdaderos";P
terminar

si (NOT a) ->
    mostrar "a es falso";P
terminar
```

### Comentarios

```
# Esto es un comentario de línea
```

## Estructura de Archivos

```
compiladores-pl3/
├── compilador/          # Código fuente del compilador
│   ├── src/
│   │   ├── main/
│   │   │   ├── antlr4/ # Gramáticas ANTLR
│   │   │   │   ├── epp/
│   │   │   │   └── csv/
│   │   │   └── java/   # Implementación Java
│   │   │       ├── epp/
│   │   │       └── csv/
│   └── pom.xml
├── pruebas/             # Casos de prueba
│   ├── csv/
│   └── epp/
│       ├── basico/
│       ├── avanzado/
│       ├── errores/
│       └── jasmin/
├── jasmin/
│   ├── ejemplos-manuales/  # 12 ejemplos Jasmin
│   └── herramientas/
│       └── jasmin-2.4/
└── docs/                # Documentación
```

## Solución de Problemas

### Error: "cannot find symbol"
- Ejecuta `mvn clean package` para regenerar las fuentes

### Error: "Variable no declarada"
- Verifica que todas las variables sean asignadas antes de usarse

### Error al compilar con Jasmin
- Verifica que la ruta a `jasmin.jar` sea correcta
- Asegúrate de tener Java instalado

### El programa .class no se ejecuta
- Verifica que el nombre de la clase coincida con el archivo
- Ejecuta desde el directorio donde está el .class

## Archivos de Prueba Disponibles

- `pruebas/epp/basico/E++.txt` - Programa básico
- `pruebas/epp/jasmin/Prueba_BuclePara.txt` - Bucles for
- `pruebas/epp/jasmin/Prueba_MientrasYBool.txt` - Bucles while
- `pruebas/epp/jasmin/Prueba_OpAritmeticas_Av.txt` - Operaciones aritméticas
- `pruebas/epp/jasmin/Prueba_ErrorSemantico.txt` - Prueba de errores (no compila)

## Contacto y Soporte

Para más información, consulta:
- `docs/DECISIONES_DISEÑO.md` - Decisiones de diseño técnicas
- `enunciado/REQUISITOS.txt` - Lista de requisitos
