#!/bin/bash

# Script para probar archivos de pruebas/epp/errores
# Estos archivos deben generar errores controlados

echo "======================================"
echo "  Pruebas E++ - Casos de Error"
echo "======================================"

# Directorio de pruebas
TEST_DIR="../pruebas/epp/errores"

# Archivos de prueba
FILES=(
    "error_lexico_caracter_invalido.txt"
    "error_semantico_division_cero.txt"
    "error_semantico_multiples_variables.txt"
    "error_semantico_uso_antes_declaracion.txt"
    "error_semantico_variable_no_declarada.txt"
    "error_sintactico_expresion_incompleta.txt"
    "error_sintactico_falta_fin.txt"
    "error_sintactico_parentesis.txt"
)

# Procesar cada archivo
for FILE in "${FILES[@]}"; do
    echo ""
    echo "--------------------------------------"
    echo "Procesando: $FILE"
    echo "--------------------------------------"
    
    # Intentar generar archivo .j (se espera que falle)
    echo "Intentando compilar (se espera error)..."
    mvn exec:java -Dexec.mainClass="epp.EPPCompilerCLI" -Dexec.args="$TEST_DIR/$FILE" -q
    
    if [ $? -ne 0 ]; then
        echo "✅ Error detectado correctamente para $FILE"
    else
        echo "⚠️  Advertencia: $FILE no generó error (debería fallar)"
        
        # Si se generó .j, intentar compilar y ejecutar
        J_FILE="${TEST_DIR}/${FILE%.txt}.j"
        if [ -f "$J_FILE" ]; then
            echo "Intentando compilar .j generado..."
            java -jar ../jasmin/herramientas/jasmin-2.4/jasmin.jar "$J_FILE" 2>&1
            
            # Extraer nombre de clase del archivo
            CLASS_NAME=$(grep "^\.class" "$J_FILE" | awk '{print $NF}')
            if [ -n "$CLASS_NAME" ]; then
                echo "Intentando ejecutar clase: $CLASS_NAME"
                java -cp "$TEST_DIR" "$CLASS_NAME" 2>&1 || true
            fi
        fi
    fi
done

echo ""
echo "======================================"
echo "  Pruebas de errores finalizadas"
echo "======================================"
