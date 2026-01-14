package csv;

import java.util.*;

/**
 * Visitor para convertir archivos CSV en formato JSON.
 * La primera fila se trata como cabecera (nombres de campos).
 */
public class CSVToJsonVisitor extends CSVParserBaseVisitor<String> {

    private List<String> header = new ArrayList<>();
    private List<Map<String, String>> records = new ArrayList<>();

    @Override
    public String visitCsv(CSVParser.CsvContext ctx) {
        super.visitCsv(ctx);
        return toJSON();
    }

    @Override
    public String visitFila(CSVParser.FilaContext ctx) {
        List<String> row = new ArrayList<>();
        
        for (CSVParser.CampoContext campo : ctx.campo()) {
            row.add(visitCampo(campo));
        }
        
        // Primera fila = cabecera
        if (header.isEmpty()) {
            header = row;
        } else {
            // Crear registro solo si coincide el número de campos
            if (row.size() == header.size()) {
                Map<String, String> record = new LinkedHashMap<>();
                for (int i = 0; i < header.size(); i++) {
                    record.put(header.get(i), row.get(i));
                }
                records.add(record);
            }
        }
        return null;
    }

    @Override
    public String visitCampo(CSVParser.CampoContext ctx) {
        String text = ctx.getText();
        
        if (text.isEmpty()) {
            return "";
        }
        
        // Limpiar campos entrecomillados
        if (text.startsWith("\"") && text.endsWith("\"")) {
            text = text.substring(1, text.length() - 1)
                      .replace("\"\"", "\"");
        }
        
        return text.trim();
    }

    // Genera el JSON final
    private String toJSON() {
        StringBuilder json = new StringBuilder();
        json.append("[\n");
        
        for (int i = 0; i < records.size(); i++) {
            json.append("  {\n");
            
            Map<String, String> record = records.get(i);
            int fieldCount = 0;
            
            // Agregar cada campo del registro
            for (Map.Entry<String, String> entry : record.entrySet()) {
                json.append("    \"")
                    .append(escapeJSON(entry.getKey())) //Clave del campo
                    .append("\": \"")
                    .append(escapeJSON(entry.getValue())) //Valor del campo
                    .append("\"");
                
                if (fieldCount < record.size() - 1) {
                    json.append(","); //coma entre campos
                }
                json.append("\n");
                fieldCount++;
            }
            
            json.append("  }");
            if (i < records.size() - 1) {
                json.append(","); //coma entre registros
            }
            json.append("\n");
        }
        
        json.append("]");
        return json.toString();
    }
    
    // Escapa caracteres especiales para JSON válido
    private String escapeJSON(String text) {
        return text.replace("\\", "\\\\") // Primero escapar la barra invertida
                   .replace("\"", "\\\"") // Luego escapar las comillas
                   .replace("\n", "\\n") // Reemplazar nueva línea
                   .replace("\r", "\\r") // Reemplazar retorno 
                   .replace("\t", "\\t"); // Reemplazar tabulación
    }
}