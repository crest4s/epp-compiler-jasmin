#!/bin/bash

# Script maestro para ejecutar todas las pruebas

echo "=========================================="
echo "  E++ - Suite Completa de Pruebas"
echo "=========================================="

# 1. Compilar el proyecto
echo ""
echo "[0] Compilando proyecto Maven..."
mvn clean compile -q

if [ $? -ne 0 ]; then
    echo "❌ Error al compilar el proyecto"
    exit 1
fi

echo "✅ Proyecto compilado exitosamente"

# 2. Ejecutar pruebas básicas
echo ""
echo "=========================================="
./test_basico.sh

# 3. Ejecutar pruebas avanzadas
echo ""
echo "=========================================="
./test_avanzado.sh

# 4. Ejecutar pruebas de jasmin
echo ""
echo "=========================================="
./test_jasmin.sh

# 5. Ejecutar pruebas de errores
echo ""
echo "=========================================="
./test_errores.sh

echo ""
echo "=========================================="
echo "  TODAS LAS PRUEBAS FINALIZADAS"
echo "=========================================="
