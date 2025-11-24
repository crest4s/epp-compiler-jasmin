package csv;

import java.util.*;

// Extiende la clase base generada por ANTLR
public class CSVToJsonVisitor extends CSVParserBaseVisitor<Object> {

    // Lista para almacenar los nombres de las columnas (cabeceras)
    private List<String> header = new ArrayList<>();

    // Lista para almacenar todos los objetos JSON (una lista de Map<String, String>)
    private List<Map<String, String>> records = new ArrayList<>();

    //Visita la regla hdr (cabecera)
    @Override
    public Object visitCsv(CSVParser.CsvContext ctx) {
        //Ejecuta el recorrido por todas las filas (regla fila)
        super.visitCsv(ctx);

        //Al finalizar, convierte la estructura de datos a un String con formato JSON
        return convertRecordsToJsonString(records);
    }

    //Vistia la regla fila
    @Override
    public Object visitFila(CSVParser.FilaContext ctx) {
        List<String> currentData = new ArrayList<>();

        // 1. Recorre todos los campos de la fila actual
        for (CSVParser.CampoContext campoCtx : ctx.campo()) {
            // El resultado de visitCampo es la cadena limpia del campo
            currentData.add((String) visitCampo(campoCtx));
        }

        // 2. Lógica para diferenciar el encabezado de los datos:
        if (header.isEmpty()) {
            // La primera fila que se procesa: la trata como encabezado.
            header = currentData;
        } else {
            // Ya tenemos encabezado: esta es una fila de datos.
            if (currentData.size() == header.size()) {
                Map<String, String> record = new LinkedHashMap<>();
                for (int i = 0; i < header.size(); i++) {
                    // Mapea la clave (header) con el valor del campo
                    record.put(header.get(i), currentData.get(i));
                }
                records.add(record);
            } else {
                // Manejo de errores básico (opcional): si la fila no tiene el tamaño correcto.
                System.err.println("Error de formato: Fila con número incorrecto de campos.");
            }
        }
        // No devolvemos la lista de strings para evitar que se use accidentalmente en otros niveles.
        return null;
    }

    //Visita la regla campo (cada uno de los datos)
    @Override
    public Object visitCampo(CSVParser.CampoContext ctx) {
        // Si el campo está vacío (ej: ;;), ctx.getText() es un string vacío.
        if (ctx.getText().isEmpty()) {
            return "";
        }

        // Si la regla matchea un campo entrecomillado (QUOTED) o texto (TEXTO)
        String text = ctx.getText();

        // Lógica para limpiar campos QUOTED (entrecomillados):
        if (text.length() > 1 && text.startsWith("\"") && text.endsWith("\"")) {
            // 1. Quita las comillas externas
            text = text.substring(1, text.length() - 1);
            // 2. Reemplaza las comillas escapadas ("") por una comilla simple (")
            text = text.replace("\"\"", "\"");
        }

        return text.trim();
    }

    //Genera la cadena de texto con el formato JSON
    private String convertRecordsToJsonString(List<Map<String, String>> records) {
        StringBuilder sb = new StringBuilder();

        // Empieza el array: [
        sb.append("[ \n");

        for (int i = 0; i < records.size(); i++) {
            Map<String, String> record = records.get(i);

            // Empieza el objeto: {
            sb.append("\t{ \n");

            int count = 0;
            for (Map.Entry<String, String> entry : record.entrySet()) {

                // Clave: 'Valor' con doble tabulación de indentación
                sb.append("\t\t")
                        .append(entry.getKey())
                        .append(": '")
                        .append(entry.getValue())
                        .append("'");

                if (count < record.size() - 1) {
                    sb.append(",\n"); // Coma y salto de línea para el siguiente campo
                } else {
                    sb.append("\n"); // Salto de línea antes de cerrar el objeto
                }
                count++;
            }

            // Cierra el objeto: }
            sb.append("\t}");

            if (i < records.size() - 1) {
                sb.append(",\n"); // Coma y salto de línea para el siguiente objeto
            } else {
                sb.append("\n"); // Salto de línea final antes de cerrar el array
            }
        }

        // Cierra el array: ]
        sb.append("]");
        return sb.toString();
    }
}