# Documentación

Esta carpeta contiene toda la documentación del proyecto.

## Contenido

### Documentación del Proyecto

#### `GUIA_USO.md`
Guía completa de usuario para:
- Compilar el proyecto
- Usar el compilador E++
- Usar el conversor CSV → JSON
- Sintaxis del lenguaje E++
- Ejemplos de uso
- Solución de problemas

#### `DECISIONES_DISEÑO.md`
Documentación técnica detallada sobre:
- Características del lenguaje E++
- Implementación de la tabla de símbolos
- Sistema de gestión de errores (léxicos, sintácticos, semánticos)
- Estrategia de generación de código Jasmin
- Pipeline de compilación completo
- Limitaciones y conclusiones

### Enunciado y Requisitos

#### Enunciado Original
Ubicado en `/enunciado/enunciado.txt`

**Contenido del enunciado:**
- Parte 1: CSV a JSON (2.5 puntos)
- Parte 2: Ejemplos Jasmin manuales (2.5 puntos)
- Parte 3: Compilador E++ completo (5 puntos)
  - Nivel básico (1.5 puntos)
  - Nivel intermedio (3.5 puntos)

#### Checklist de Requisitos
Ubicado en `/enunciado/REQUISITOS.txt` - Lista detallada de todos los requisitos con estado de completado.

### Memoria del Proyecto

**Nota:** La memoria principal se está desarrollando en un entorno externo.

La memoria debe incluir (según enunciado):
- Explicación de las decisiones de diseño ✅ (ver DECISIONES_DISEÑO.md)
- Descripción de la tabla de símbolos ✅ (incluido en DECISIONES_DISEÑO.md)
- Sistema de gestión de errores ✅ (incluido en DECISIONES_DISEÑO.md)
- Proceso de generación de código Jasmin ✅ (incluido en DECISIONES_DISEÑO.md)
- Conjunto de pruebas y validación ✅ (ver sección abajo)
- Resultados de ejecución ✅ (ver RESULTADOS_EJECUCION.md en jasmin/ejemplos-manuales/)

## Estado del Proyecto

### ✅ COMPLETADO

**Parte 1: CSV → JSON**
- Gramáticas CSV funcionales
- Visitor CSVToJsonVisitor implementado
- Listener CSVSemanticListener para validación
- Pipeline completo con gestión de errores
- Archivos de prueba validados

**Parte 2: Ejemplos Jasmin**
- 12 ejemplos completos con código Jasmin
- Todos compilados y ejecutados
- Resultados documentados en `/jasmin/ejemplos-manuales/RESULTADOS_EJECUCION.md`

**Parte 3: Compilador E++**

*Nivel Básico:*
- ✅ Operadores aritméticos (+, -, *, /, %)
- ✅ Bucle FOR (para)
- ✅ Bucle WHILE (mientras)
- ✅ Tipo booleano (verdadero/falso)
- ✅ Operadores lógicos (AND, OR, NOT)

*Nivel Intermedio:*
- ✅ Tabla de símbolos (SymbolTable.java)
- ✅ Gestión de errores semánticos (EPPSemanticListener.java)
- ✅ Generación de código Jasmin (EPPToJasminVisitor.java)
- ✅ Conjunto completo de pruebas
- ✅ Casos de error (léxicos, sintácticos, semánticos)
- ✅ Pipeline end-to-end validado
- ✅ Documentación técnica completa

## Archivos de Prueba

### CSV
- `/pruebas/csv/CSV_01.txt` - Datos estructurados
- `/pruebas/csv/CSV_02.txt` - Más casos
- `/pruebas/csv/CSV_01_salida.json` - Salida generada

### E++ - Básicos
- `/pruebas/epp/basico/E++.txt`
- `/pruebas/epp/basico/E++_Ampliado.txt`

### E++ - Avanzados
- `/pruebas/epp/avanzado/E++_AmpliadoV2.txt`

### E++ - Para Jasmin
- `/pruebas/epp/jasmin/Prueba_BuclePara.txt` (+ .j generado)
- `/pruebas/epp/jasmin/Prueba_MientrasYBool.txt` (+ .j generado)
- `/pruebas/epp/jasmin/Prueba_OpAritmeticas_Av.txt` (+ .j generado)
- `/pruebas/epp/jasmin/Prueba_ErrorSemantico.txt` (casos de error)

### E++ - Errores
- `/pruebas/epp/errores/error_lexico_caracter_invalido.txt`
- `/pruebas/epp/errores/error_sintactico_*.txt` (varios)
- `/pruebas/epp/errores/error_semantico_*.txt` (varios)

## Referencias Útiles

- [Guía oficial de Jasmin](https://jasmin.sourceforge.net/guide.html)
- [Documentación ANTLR4](https://github.com/antlr/antlr4/blob/master/doc/index.md)
- [JVM Specification](https://docs.oracle.com/javase/specs/jvms/se17/html/index.html)

## Estructura del Compilador

```
Archivo E++ (.txt)
    ↓
EPPLexer (Análisis Léxico)
    ↓
EPPParser (Análisis Sintáctico) → AST
    ↓
EPPSemanticListener (Análisis Semántico)
    ↓
EPPToJasminVisitor (Generación de Código)
    ↓
Archivo Jasmin (.j)
    ↓
Jasmin Assembler
    ↓
Bytecode JVM (.class)
    ↓
Ejecución en JVM
```

## Herramientas Utilizadas

- **ANTLR 4.13.2**: Generación de analizadores léxico/sintácticos
- **Java 25**: Lenguaje de implementación
- **Maven 3.x**: Gestión de dependencias y compilación
- **Jasmin 2.4**: Assembler de bytecode para JVM
- **JUnit 5**: Testing (opcional)

## Contacto

Para dudas sobre la implementación, consultar:
1. Esta documentación
2. Los comentarios en el código fuente
3. Los archivos de prueba como ejemplos de uso

