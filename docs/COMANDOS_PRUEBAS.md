# Guía de Comandos para Pruebas E++

Este documento contiene todos los comandos necesarios para compilar y ejecutar las pruebas del compilador E++.

## Requisitos Previos

1. Compilar el proyecto Maven:
```bash
cd compilador
mvn clean package
cd ..
```

---

## Opción Rápida: Scripts Automatizados

Se han creado scripts para automatizar todo el proceso de pruebas:

### Script Maestro (ejecuta todo)
```bash
./scripts/ejecutar_todo.sh
```
Este script ejecuta automáticamente todos los pasos: compila el proyecto Maven (si es necesario), genera archivos .j, compila a .class y ejecuta todas las pruebas.

### Scripts Individuales

**1. Generar archivos .j:**
```bash
./scripts/1_generar_jasmin.sh
```

**2. Compilar .j a .class:**
```bash
./scripts/2_compilar_class.sh
```

**3. Ejecutar pruebas:**
```bash
./scripts/3_ejecutar_pruebas.sh
```

---

## Comandos Manuales (uno a uno)

Si prefieres ejecutar las pruebas manualmente, aquí están todos los comandos individuales:

---

## Pruebas Básicas

### 1. E++.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/basico/E++.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/basico
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar E__.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/basico
java E__
cd ../../..
```

---

### 2. E++_Ampliado.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/basico/E++_Ampliado.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/basico
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar E___Ampliado.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/basico
java E___Ampliado
cd ../../..
```

---

### 3. E++_AmpliadoV2.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/basico/E++_AmpliadoV2.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/basico
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar E___AmpliadoV2.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/basico
java E___AmpliadoV2
cd ../../..
```

---

### 4. prueba_simple.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/basico/prueba_simple.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/basico
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar prueba_simple.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/basico
java prueba_simple
cd ../../..
```

---

## Pruebas Avanzadas

### 5. E++_AmpliadoV2.txt (Avanzado)

**Generar archivo .j:**
```bash
echo "pruebas/epp/avanzado/E++_AmpliadoV2.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/avanzado
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar E___AmpliadoV2.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/avanzado
java E___AmpliadoV2
cd ../../..
```

---

## Pruebas Jasmin

### 6. Prueba_BuclePara.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/jasmin/Prueba_BuclePara.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/jasmin
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar Prueba_BuclePara.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/jasmin
java Prueba_BuclePara
cd ../../..
```

---

### 7. Prueba_ErrorSemantico.txt

**Generar archivo .j (debería fallar):**
```bash
echo "pruebas/epp/jasmin/Prueba_ErrorSemantico.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

---

### 8. Prueba_MientrasYBool.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/jasmin/Prueba_MientrasYBool.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/jasmin
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar Prueba_MientrasYBool.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/jasmin
java Prueba_MientrasYBool
cd ../../..
```

---

### 9. Prueba_OpAritmeticas_Av.txt

**Generar archivo .j:**
```bash
echo "pruebas/epp/jasmin/Prueba_OpAritmeticas_Av.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

**Generar archivo .class:**
```bash
cd pruebas/epp/jasmin
java -jar ../../../jasmin/herramientas/jasmin-2.4/jasmin.jar Prueba_OpAritmeticas_Av.j
cd ../../..
```

**Ejecutar programa:**
```bash
cd pruebas/epp/jasmin
java Prueba_OpAritmeticas_Av
cd ../../..
```

---

## Pruebas de Errores

Las siguientes pruebas están diseñadas para fallar y validar el manejo de errores del compilador.

### 10. error_lexico_caracter_invalido.txt

```bash
echo "pruebas/epp/errores/error_lexico_caracter_invalido.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 11. error_semantico_division_cero.txt

```bash
echo "pruebas/epp/errores/error_semantico_division_cero.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 12. error_semantico_multiples_variables.txt

```bash
echo "pruebas/epp/errores/error_semantico_multiples_variables.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 13. error_semantico_uso_antes_declaracion.txt

```bash
echo "pruebas/epp/errores/error_semantico_uso_antes_declaracion.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 14. error_semantico_variable_no_declarada.txt

```bash
echo "pruebas/epp/errores/error_semantico_variable_no_declarada.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 15. error_sintactico_expresion_incompleta.txt

```bash
echo "pruebas/epp/errores/error_sintactico_expresion_incompleta.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 16. error_sintactico_falta_fin.txt

```bash
echo "pruebas/epp/errores/error_sintactico_falta_fin.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

### 17. error_sintactico_parentesis.txt

```bash
echo "pruebas/epp/errores/error_sintactico_parentesis.txt" | java -cp compilador/target/maven-project-1.0-SNAPSHOT-jar-with-dependencies.jar epp.EPPMain
```

---

## Notas Importantes

1. **Archivos con nombre "E++"**: El compilador convierte automáticamente los caracteres especiales en nombres válidos de clase Java (sustituye `+` por `_`).

2. **Archivos de error**: Las pruebas en la carpeta `errores/` están diseñadas para fallar. No se generarán archivos `.j` ni `.class` para estas.

3. **Archivos con bugs conocidos**: Algunos archivos (E++_Ampliado.txt, E++_AmpliadoV2.txt, Prueba_OpAritmeticas_Av.txt) compilan a .j pero contienen errores de sintaxis de Jasmin. El compilador E++ tiene bugs en estos casos.

4. **Orden de ejecución**: Siempre debe seguirse el orden: 
   - Generar `.j` → Generar `.class` → Ejecutar programa

5. **Ruta del proyecto**: Todos los comandos asumen que se ejecutan desde la raíz del proyecto `compiladores-pl3`.

---

## Archivos que Funcionan Correctamente

### Pruebas funcionales (compilan y ejecutan correctamente):
- ✅ `pruebas/epp/basico/E++.txt`
- ✅ `pruebas/epp/basico/prueba_simple.txt`
- ✅ `pruebas/epp/jasmin/Prueba_BuclePara.txt`
- ✅ `pruebas/epp/jasmin/Prueba_MientrasYBool.txt`

### Pruebas de error (fallan correctamente):
- ❌ `pruebas/epp/errores/*` (8 archivos)
- ❌ `pruebas/epp/jasmin/Prueba_ErrorSemantico.txt`

### Archivos con bugs del compilador (generan .j inválido):
- ⚠️ `pruebas/epp/basico/E++_Ampliado.txt`
- ⚠️ `pruebas/epp/basico/E++_AmpliadoV2.txt`
- ⚠️ `pruebas/epp/avanzado/E++_AmpliadoV2.txt`
- ⚠️ `pruebas/epp/jasmin/Prueba_OpAritmeticas_Av.txt`
