# Compiladores PL3 - Práctica 3

Compilador completo desde análisis léxico hasta generación de código para el lenguaje E++, incluyendo traductor de CSV a JSON.

**Universidad de Alcalá - Procesadores del Lenguaje**

---

## 📋 Contenido del Proyecto

### Parte 1: CSV a JSON (2.5 puntos)
Conversor de archivos CSV a formato JSON usando ANTLR y visitors.

### Parte 2: Ejemplos Jasmin (2.5 puntos)
12 ejemplos documentados de generación manual de código Jasmin, cubriendo desde programas vacíos hasta funciones con parámetros.

### Parte 3: Compilador E++ (5 puntos)
Compilador completo para el lenguaje E++ con:
- **Nivel Básico (1.5 pts):** Operaciones aritméticas completas, bucles (for/while), tipos booleanos
- **Nivel Intermedio (3.5 pts):** Tabla de símbolos, gestión de errores, generación de código Jasmin

---

## 📂 Estructura del Proyecto

```
compiladores-pl3/
├── compilador/              # Proyecto Maven con el compilador
│   ├── src/
│   │   ├── main/
│   │   │   ├── antlr4/     # Gramáticas ANTLR4
│   │   │   │   ├── csv/    # Gramática CSV
│   │   │   │   └── epp/    # Gramática E++
│   │   │   ├── java/       # Código fuente Java
│   │   │   │   ├── csv/    # Visitor CSV a JSON
│   │   │   │   └── epp/    # Visitor E++ a Jasmin
│   │   │   └── resources/
│   │   └── test/
│   ├── pom.xml
│   └── target/
│
├── pruebas/                 # Archivos de prueba organizados
│   ├── csv/                # Pruebas CSV → JSON
│   │   ├── CSV_01.txt
│   │   ├── CSV_02.txt
│   │   └── CSV_01_salida.json
│   └── epp/                # Pruebas E++
│       ├── basico/         # Pruebas nivel básico
│       ├── avanzado/       # Pruebas avanzadas
│       ├── jasmin/         # Pruebas generación Jasmin
│       └── errores/        # Pruebas de errores
│
├── jasmin/                  # Herramientas y ejemplos Jasmin
│   ├── ejemplos-manuales/  # 12 ejemplos documentados (Parte 2)
│   │   ├── 01-ejemplo1/    # Programa vacío
│   │   ├── 02-ejemplo2/    # Hola Mundo
│   │   ├── 03-ejemplo3/    # Multiplicación
│   │   └── ...
│   └── herramientas/
│       └── jasmin-2.4/     # Assembler Jasmin
│
├── ejemplos/                # Ejemplos de referencia del profesor
│   └── demo-profesor/      # Demos ANTLR y visitors
│
├── docs/                    # Documentación del proyecto
│   └── pdfs/
│
└── enunciado/               # Enunciado de la práctica
    ├── enunciado.txt
    └── REQUISITOS.txt
```

---

## 🚀 Instalación y Uso

### Requisitos Previos
- **Java JDK 11+**
- **Maven 3.6+**
- **ANTLR 4** (incluido en Maven)
- **Jasmin 2.4** (incluido en `jasmin/herramientas/`)

### Compilar el Proyecto
```bash
cd compilador
mvn clean compile
mvn package
```

### Ejecutar el Compilador

#### CSV a JSON
```bash
cd compilador
java -cp target/compilador.jar csv.CSVMain ../pruebas/csv/CSV_01.txt
```

#### Compilar E++
```bash
cd compilador
java -cp target/compilador.jar epp.EPPMain ../pruebas/epp/basico/prueba_simple.txt
```

### Ejecutar Código Jasmin
```bash
cd jasmin/herramientas/jasmin-2.4
java -jar jasmin.jar output.j
java output
```

---

## 📚 Referencias

### Documentación
- [Guía Jasmin](https://jasmin.sourceforge.net/guide.html)
- [ANTLR 4 Documentation](https://github.com/antlr/antlr4/blob/master/doc/index.md)

### Videos y Recursos
- [Video: Visitors en ANTLR](https://www.youtube.com/watch?v=i8GRcuIkrhA)
- Video del profesor: Explicación Visitors y generación de código intermedio

### Descargas
- [Jasmin Assembler](https://sourceforge.net/projects/jasmin/files/)

---

## 📝 Notas de Desarrollo

- Las gramáticas ANTLR están en `compilador/src/main/antlr4/`
- Los visitors están en `compilador/src/main/java/`
- Los archivos generados se guardan en `compilador/target/`
- Los archivos `.j` generados automáticamente no se versionan (ver `.gitignore`)
- Los ejemplos manuales de Jasmin sí se versionan en `jasmin/ejemplos-manuales/`

---

## 👥 Autores

Adrián Morales Rodríguez
*Procesadores del Lenguaje - Universidad de Alcalá*

---

## 📄 Licencia

Proyecto académico para la asignatura de Procesadores del Lenguaje.
