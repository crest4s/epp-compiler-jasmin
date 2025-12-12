#!/bin/bash

# Script para probar archivos de pruebas/epp/avanzado

echo "======================================"
echo "  Pruebas E++ - Casos Avanzados"
echo "======================================"

# Directorio de pruebas
TEST_DIR="../pruebas/epp/avanzado"

# Archivo de prueba
FILE="E++_AmpliadoV2.txt"
CLASS="E___AmpliadoV2"

echo ""
echo "--------------------------------------"
echo "Procesando: $FILE"
echo "--------------------------------------"

# 1. Generar archivo .j
echo "[1/3] Generando archivo .j..."
mvn exec:java -Dexec.mainClass="epp.EPPCompilerCLI" -Dexec.args="$TEST_DIR/$FILE" -q

if [ $? -ne 0 ]; then
    echo "❌ Error al generar .j para $FILE"
    exit 1
fi

# 2. Compilar .j a .class
echo "[2/3] Compilando .j a .class..."
J_FILE="${TEST_DIR}/${FILE%.txt}.j"
java -jar ../jasmin/herramientas/jasmin-2.4/jasmin.jar "$J_FILE"

if [ $? -ne 0 ]; then
    echo "❌ Error al compilar $J_FILE"
    exit 1
fi

# 3. Ejecutar el .class
echo "[3/3] Ejecutando programa:"
echo "---"
java -cp "$TEST_DIR" "$CLASS"
echo "---"
echo "✅ $FILE completado exitosamente"

echo ""
echo "======================================"
echo "  Prueba finalizada"
echo "======================================"
