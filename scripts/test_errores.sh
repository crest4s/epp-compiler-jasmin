#!/bin/bash

# Script para probar detección de errores en E++

echo "=== PRUEBAS DE DETECCIÓN DE ERRORES E++ ==="
echo ""

DIR_ERRORES="/Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/pruebas/epp/errores"
DIR_COMPILADOR="/Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/compilador"

cd "$DIR_COMPILADOR"

for archivo in "$DIR_ERRORES"/*.txt; do
    nombre=$(basename "$archivo")
    echo ">>> Probando: $nombre"
    echo "$archivo" | mvn -q exec:java -Dexec.mainClass="epp.EPPMain" 2>&1 | grep -E "(Error|error|fallida|Compilación exitosa)" | head -5
    echo ""
done

echo "=== FIN DE PRUEBAS ==="
