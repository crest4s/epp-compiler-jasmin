# Pruebas del Compilador

Esta carpeta contiene todos los archivos de prueba para verificar el correcto funcionamiento del compilador.

## Estructura

### `/csv`
Archivos de prueba para la **Parte 1** del proyecto: conversión de CSV a JSON.

- `CSV_01.txt` - Archivo CSV de ejemplo con datos de campeones
- `CSV_02.txt` - Segundo archivo CSV de prueba
- `CSV_01_salida.json` - Salida esperada para CSV_01.txt

### `/epp`
Archivos de prueba para la **Parte 3** del proyecto: compilador completo de E++.

#### `/epp/basico`
Pruebas básicas del lenguaje E++ (nivel básico - 1.5 puntos):
- `prueba_simple.txt` - Prueba simple del lenguaje
- `E++.txt` - Archivo de prueba básico original
- `E++_Ampliado.txt` - Pruebas con extensiones básicas
- `E++_AmpliadoV2.txt` - Segunda versión de pruebas ampliadas

#### `/epp/avanzado`
Pruebas avanzadas del lenguaje E++ con características completas:
- `E++_AmpliadoV2.txt` - Pruebas avanzadas completas

#### `/epp/jasmin`
Pruebas para la generación de código Jasmin (nivel intermedio):
- `Prueba_BuclePara.txt` - Prueba de bucles FOR
- `Prueba_MientrasYBool.txt` - Prueba de bucles WHILE y expresiones booleanas
- `Prueba_OpAritmeticas_Av.txt` - Prueba de operaciones aritméticas avanzadas
- `Prueba_ErrorSemantico.txt` - Prueba de detección de errores semánticos

#### `/epp/errores`
*(Carpeta preparada para futuros archivos de prueba de errores)*
- Errores léxicos
- Errores sintácticos
- Errores semánticos

## Uso

Para ejecutar las pruebas, utiliza el compilador desde la carpeta `compilador/` con los archivos de esta carpeta como entrada.

### Ejemplo para CSV:
```bash
# Desde la carpeta compilador/
java -jar target/compilador.jar ../pruebas/csv/CSV_01.txt
```

### Ejemplo para E++:
```bash
# Desde la carpeta compilador/
java -jar target/compilador.jar ../pruebas/epp/basico/prueba_simple.txt
```
