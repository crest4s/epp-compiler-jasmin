package csv;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;

/**
 * Listener para realizar el análisis semántico de un archivo CSV.
 * Acumula todos los errores encontrados en una lista y utiliza manejo de excepciones
 * para garantizar que el análisis continúe a pesar de errores internos.
 */
public class CSVSemanticListener extends CSVParserBaseListener {

    // ************ ESTADO DEL LISTENER ************
    private List<String> errorList = new ArrayList<>();
    private List<String> header = new ArrayList<>();
    private Map<Integer, String> tiposColumna = new HashMap<>();
    private boolean isFirstRow = true;
    private boolean isFirstDataRow = true;
    private int expectedFieldCount = -1;
    private String detectedSeparator = null;

    /** Devuelve la lista de mensajes de error acumulados. */
    public List<String> getErrorMessages() {
        return errorList;
    }

    private void logError(int linea, String message) {
        errorList.add("Línea " + linea + ": " + message);
    }

    private String inferirTipo(String valor) {
        valor = valor.trim();
        if (valor.isEmpty()) return "STRING";

        if (valor.matches("^-?\\d+$")) return "INTEGER";
        if (valor.matches("^-?\\d+[.,]\\d+$")) return "FLOAT";
        if (valor.equalsIgnoreCase("true") || valor.equalsIgnoreCase("false")) return "BOOLEAN";
        if (valor.matches("\\d{4}-\\d{2}-\\d{2}")) return "DATE";

        return "STRING";
    }

    private List<String> extractRowValues(CSVParser.FilaContext ctx) {
        List<String> row = new ArrayList<>();

        for (CSVParser.CampoContext campo : ctx.campo()) {
            String text = campo.getText();
            if (text.startsWith("\"") && text.endsWith("\"")) {
                text = text.substring(1, text.length() - 1).replace("\"\"", "\"");
            }
            row.add(text.trim());
        }
        return row;
    }

    @Override
    public void enterFila(CSVParser.FilaContext ctx) {
        // Bloque try-catch robusto para asegurar que las excepciones no manejadas
        // (como NullPointerException, etc.) no detengan la acumulación de errores.
        try {
            processFila(ctx);
        } catch (RuntimeException e) {
            // Se registra cualquier error interno inesperado y se continúa
            logError(ctx.start.getLine(), "Error interno inesperado durante el procesamiento: " + e.getMessage());
        }
    }

    private void processFila(CSVParser.FilaContext ctx) {

        List<String> row = extractRowValues(ctx);
        int currentFieldCount = ctx.campo().size();
        int linea = ctx.start.getLine();
        List<TerminalNode> separadores = ctx.SEPARADOR();

        // 1. Manejo de filas vacías
        if (currentFieldCount == 1 && row.get(0).isEmpty()) {
            return;
        }

        boolean isCurrentRowValid = true;

        // 2. Procesamiento de la Cabecera (Primera fila)
        if (isFirstRow) {
            header = row;
            expectedFieldCount = currentFieldCount;
            isFirstRow = false;

            if (!separadores.isEmpty()) {
                detectedSeparator = separadores.get(0).getText();
            }
            return;
        }

        // A. CHEQUEO: Consistencia del Separador
        if (detectedSeparator != null) {
            for (TerminalNode sep : separadores) {
                if (!sep.getText().equals(detectedSeparator)) {
                    logError(linea, "Separador inconsistente. Se esperaba '" + detectedSeparator +
                            "' pero se encontró '" + sep.getText() + "'.");
                    isCurrentRowValid = false;
                    break; // Solo necesitamos reportar un error de separador por fila
                }
            }
        }

        // B. CHEQUEO: Consistencia del Número de Campos
        if (expectedFieldCount != -1 && currentFieldCount != expectedFieldCount) {
            logError(linea, "Número de campos inconsistente. Se esperaban " + expectedFieldCount +
                    " campos, se encontraron " + currentFieldCount + ".");
            isCurrentRowValid = false;
        }

        // C. CHEQUEO: Consistencia de Tipos de Datos
        // Solo intentamos chequear tipos si la cuenta de campos es la esperada.
        // O si es la primera fila de datos, donde se inicializa el tipo.
        if (isCurrentRowValid) {
            if (isFirstDataRow) {
                // Establecer tipos iniciales basados en la primera fila de datos
                for (int i = 0; i < currentFieldCount; i++) {
                    tiposColumna.put(i, inferirTipo(row.get(i)));
                }
                isFirstDataRow = false;
            } else {
                // Validar tipos
                for (int i = 0; i < currentFieldCount; i++) {
                    String valor = row.get(i);
                    String nombreColumna = (i < header.size()) ? header.get(i) : "Columna " + (i + 1);
                    String tipoActual = inferirTipo(valor);
                    String tipoEsperado = tiposColumna.get(i);

                    if (tipoEsperado == null) continue;

                    if (tipoActual.equals(tipoEsperado)) {
                        // OK
                    } else if (tipoEsperado.equals("INTEGER") && tipoActual.equals("FLOAT")) {
                        tiposColumna.put(i, "FLOAT");
                    } else if (tipoEsperado.equals("STRING") && !tipoActual.equals("STRING")) {
                        // Si el valor actual es más estricto que STRING, no es un error, pero el tipo ya está fijado en STRING.
                    } else if (!tipoEsperado.equals("STRING") && tipoActual.equals("STRING") && !valor.isEmpty()) {
                        // Se esperaba un tipo estricto, pero se encontró un STRING no vacío
                        logError(linea, "Columna '" + nombreColumna + "': Se esperaba '" + tipoEsperado + "', se encontró texto ('" + valor + "').");
                    } else if (!tipoActual.equals(tipoEsperado)) {
                        // Error de tipo estricto no cubierto (ej: DATE a INTEGER)
                        logError(linea, "Columna '" + nombreColumna + "': Tipo de dato inconsistente. " +
                                "Se esperaba '" + tipoEsperado + "', se encontró '" + tipoActual +
                                "' para el valor '" + valor + "'.");
                    }
                }
            }
        }
    }
}