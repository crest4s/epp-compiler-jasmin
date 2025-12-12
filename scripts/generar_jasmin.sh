#!/bin/bash

# Script para generar archivos .j desde archivos de prueba E++

COMPILADOR_JAR="/Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar"
PRUEBAS_DIR="/Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/pruebas/epp"

echo "=== Generando archivos .j desde pruebas E++ ==="
echo ""

# Pruebas básicas
echo "Procesando pruebas básicas..."
for archivo in "$PRUEBAS_DIR"/basico/*.txt; do
    if [ -f "$archivo" ]; then
        echo "  - $(basename "$archivo")"
        echo "$archivo" | java -cp "$COMPILADOR_JAR" epp.EPPMain
    fi
done

echo ""
echo "Procesando pruebas avanzadas..."
for archivo in "$PRUEBAS_DIR"/avanzado/*.txt; do
    if [ -f "$archivo" ]; then
        echo "  - $(basename "$archivo")"
        echo "$archivo" | java -cp "$COMPILADOR_JAR" epp.EPPMain
    fi
done

echo ""
echo "Procesando pruebas para Jasmin..."
for archivo in "$PRUEBAS_DIR"/jasmin/*.txt; do
    if [ -f "$archivo" ]; then
        echo "  - $(basename "$archivo")"
        echo "$archivo" | java -cp "$COMPILADOR_JAR" epp.EPPMain
    fi
done

echo ""
echo "✅ Generación completada"
echo ""
echo "Archivos .j generados se encuentran junto a sus archivos .txt de origen"
