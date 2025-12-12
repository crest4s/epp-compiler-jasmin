#!/bin/bash

# Script para probar archivos E++

if [ $# -lt 1 ]; then
    echo "Uso: $0 <archivo.txt>"
    exit 1
fi

ARCHIVO="$1"
DIR_COMPILADOR="/Users/adrianmoralesrodriguez/Documents/Universidad/Procesadores del Lenguaje/compiladores-pl3/compilador"

cd "$DIR_COMPILADOR"

# Ejecutar compilador
echo "$ARCHIVO" | mvn -q exec:java -Dexec.mainClass="epp.EPPMain"
