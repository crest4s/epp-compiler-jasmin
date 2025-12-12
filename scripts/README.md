# Scripts de Pruebas - Compilador E++

Esta carpeta contiene scripts para automatizar el proceso de compilación y prueba del compilador E++.

## Scripts Disponibles

### 🚀 `ejecutar_todo.sh` - Script Maestro
Ejecuta todo el proceso de pruebas de forma automática.

```bash
./scripts/ejecutar_todo.sh
```

**Qué hace:**
1. Verifica que el proyecto Maven esté compilado (si no, lo compila)
2. Genera archivos Jasmin (.j) desde los archivos fuente E++
3. Compila los archivos Jasmin a bytecode (.class)
4. Ejecuta todos los programas compilados y muestra sus resultados

---

### 📝 `1_generar_jasmin.sh` - Generación de código Jasmin
Compila todos los archivos E++ a código Jasmin.

```bash
./scripts/1_generar_jasmin.sh
```

**Qué hace:**
- Procesa todos los archivos de prueba en `pruebas/epp/`
- Genera archivos `.j` (código Jasmin) para cada prueba exitosa
- Verifica que los archivos de error fallan correctamente
- Muestra un resumen de éxitos y fallos

**Archivos procesados:**
- ✅ Pruebas básicas (`pruebas/epp/basico/`)
- ✅ Pruebas avanzadas (`pruebas/epp/avanzado/`)
- ✅ Pruebas Jasmin (`pruebas/epp/jasmin/`)
- ❌ Pruebas de errores (`pruebas/epp/errores/`) - deben fallar

---

### ⚙️ `2_compilar_class.sh` - Compilación con Jasmin
Compila archivos Jasmin (.j) a bytecode Java (.class).

```bash
./scripts/2_compilar_class.sh
```

**Qué hace:**
- Lee todos los archivos `.j` generados en el paso anterior
- Los compila usando Jasmin (`jasmin.jar`)
- Genera archivos `.class` ejecutables
- Verifica que cada compilación fue exitosa

**Requisito:** Ejecutar `1_generar_jasmin.sh` primero

---

### ▶️ `3_ejecutar_pruebas.sh` - Ejecución de pruebas
Ejecuta todos los programas compilados y muestra sus resultados.

```bash
./scripts/3_ejecutar_pruebas.sh
```

**Qué hace:**
- Ejecuta cada programa `.class` generado
- Captura y muestra la salida de cada programa
- Reporta éxitos y fallos
- Muestra un resumen final

**Requisito:** Ejecutar `1_generar_jasmin.sh` y `2_compilar_class.sh` primero

---

## Flujo de Trabajo

### Opción 1: Automático (Recomendado)
```bash
./scripts/ejecutar_todo.sh
```

### Opción 2: Paso a paso
```bash
# Paso 1: Generar código Jasmin
./scripts/1_generar_jasmin.sh

# Paso 2: Compilar a bytecode
./scripts/2_compilar_class.sh

# Paso 3: Ejecutar pruebas
./scripts/3_ejecutar_pruebas.sh
```

---

## Permisos de Ejecución

Si los scripts no tienen permisos de ejecución, otórgalos con:

```bash
chmod +x scripts/*.sh
```

---

## Solución de Problemas

### Error: "No se encuentra el JAR compilado"
**Solución:** Compila el proyecto Maven primero:
```bash
cd compilador
mvn clean package
cd ..
```

### Error: "No se encuentra Jasmin"
**Solución:** Verifica que existe el archivo:
```
jasmin/herramientas/jasmin-2.4/jasmin.jar
```

### Error: "Archivo .j no encontrado"
**Solución:** Ejecuta primero el script de generación:
```bash
./scripts/1_generar_jasmin.sh
```

### Error: "Archivo .class no encontrado"
**Solución:** Ejecuta los dos primeros scripts:
```bash
./scripts/1_generar_jasmin.sh
./scripts/2_compilar_class.sh
```

---

## Estructura de Salida

Los scripts generan archivos en las mismas carpetas que los archivos fuente:

```
pruebas/epp/basico/
├── E++.txt              (entrada)
├── E__.j                (generado por script 1)
└── E__.class            (generado por script 2)

pruebas/epp/jasmin/
├── Prueba_BuclePara.txt    (entrada)
├── Prueba_BuclePara.j      (generado por script 1)
└── Prueba_BuclePara.class  (generado por script 2)
```

---

## Notas Adicionales

- Los scripts se ejecutan desde la raíz del proyecto
- Todos los scripts incluyen validación de errores
- El script maestro detiene la ejecución si algún paso falla
- Los archivos de error en `pruebas/epp/errores/` están diseñados para fallar
