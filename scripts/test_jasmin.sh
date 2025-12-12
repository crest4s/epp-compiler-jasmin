#!/bin/bash

# Script para probar archivos de pruebas/epp/jasmin

echo "======================================"
echo "  Pruebas E++ - Casos Jasmin"
echo "======================================"

# Directorio de pruebas
TEST_DIR="../pruebas/epp/jasmin"

# Archivos de prueba
FILES=(
    "Prueba_BuclePara.txt"
    "Prueba_ErrorSemantico.txt"
    "Prueba_MientrasYBool.txt"
    "Prueba_OpAritmeticas_Av.txt"
)

CLASSES=(
    "Prueba_BuclePara"
    "Prueba_ErrorSemantico"
    "Prueba_MientrasYBool"
    "Prueba_OpAritmeticas_Av"
)

# Procesar cada archivo
for i in "${!FILES[@]}"; do
    FILE="${FILES[$i]}"
    CLASS="${CLASSES[$i]}"
    
    echo ""
    echo "--------------------------------------"
    echo "Procesando: $FILE"
    echo "--------------------------------------"
    
    # 1. Generar archivo .j
    echo "[1/3] Generando archivo .j..."
    mvn exec:java -Dexec.mainClass="epp.EPPCompilerCLI" -Dexec.args="$TEST_DIR/$FILE" -q
    
    if [ $? -ne 0 ]; then
        echo "❌ Error al generar .j para $FILE"
        continue
    fi
    
    # 2. Compilar .j a .class
    echo "[2/3] Compilando .j a .class..."
    J_FILE="${TEST_DIR}/${FILE%.txt}.j"
    java -jar ../jasmin/herramientas/jasmin-2.4/jasmin.jar "$J_FILE"
    
    if [ $? -ne 0 ]; then
        echo "❌ Error al compilar $J_FILE"
        continue
    fi
    
    # 3. Ejecutar el .class
    echo "[3/3] Ejecutando programa:"
    echo "---"
    java -cp "$TEST_DIR" "$CLASS"
    echo "---"
    echo "✅ $FILE completado exitosamente"
done

echo ""
echo "======================================"
echo "  Pruebas finalizadas"
echo "======================================"
