package epp;

import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

/**
 * Listener para análisis semántico del lenguaje E++.
 * Detecta errores como:
 * - Uso de variables no declaradas
 */
public class EPPSemanticListener extends EPPParserBaseListener {
    
    private Set<String> declaredVariables;
    private List<String> errorMessages;
    
    public EPPSemanticListener() {
        this.declaredVariables = new HashSet<>();
        this.errorMessages = new ArrayList<>();
    }
    
    /**
     * Obtiene la lista de mensajes de error acumulados.
     */
    public List<String> getErrorMessages() {
        return errorMessages;
    }
    
    /**
     * Verifica si hay errores.
     */
    public boolean hasErrors() {
        return !errorMessages.isEmpty();
    }
    
    /**
     * Agrega un error a la lista.
     */
    private void addError(ParserRuleContext ctx, String message) {
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        errorMessages.add("Error semántico [Línea " + line + ":" + col + "] " + message);
    }
    
    // ===== INSTRUCCIONES - Detectar declaraciones de variables =====
    
    @Override
    public void enterInstruccion(EPPParser.InstruccionContext ctx) {
        // Registrar variables declaradas por asignaciones
        if (ctx.asignacion() != null) {
            String varName = ctx.asignacion().VARIABLE().getText();
            declaredVariables.add(varName);
        } else if (ctx.asignacionSimple() != null) {
            String varName = ctx.asignacionSimple().VARIABLE().getText();
            declaredVariables.add(varName);
        } else if (ctx.leer() != null) {
            String varName = ctx.leer().VARIABLE().getText();
            declaredVariables.add(varName);
        } else if (ctx.para() != null) {
            String varName = ctx.para().VARIABLE().getText();
            declaredVariables.add(varName);
        }
    }
    
    // ===== EXPRESIONES - Verificar uso de variables =====
    
    @Override
    public void enterExprVariable(EPPParser.ExprVariableContext ctx) {
        // Cuando se usa una variable en expresión (ej: mostrar x;P)
        String varName = ctx.VARIABLE().getText();
        if (!declaredVariables.contains(varName)) {
            addError(ctx, "Variable '" + varName + "' no ha sido declarada");
        }
    }
    
    @Override
    public void enterExprAritVariable(EPPParser.ExprAritVariableContext ctx) {
        // Cuando se usa una variable en expresión aritmética (ej: x + 1)
        String varName = ctx.VARIABLE().getText();
        if (!declaredVariables.contains(varName)) {
            addError(ctx, "Variable '" + varName + "' no ha sido declarada");
        }
    }
    
    @Override
    public void enterExprCompVariable(EPPParser.ExprCompVariableContext ctx) {
        // Cuando se usa una variable en expresión comparable (ej: x > 0)
        String varName = ctx.VARIABLE().getText();
        if (!declaredVariables.contains(varName)) {
            addError(ctx, "Variable '" + varName + "' no ha sido declarada");
        }
    }
    
    /**
     * Imprime un resumen de errores para debugging.
     */
    public void printErrorSummary() {
        if (hasErrors()) {
            System.err.println("\n=== ERRORES SEMÁNTICOS ENCONTRADOS ===");
            for (String error : errorMessages) {
                System.err.println("  • " + error);
            }
            System.err.println("Total: " + errorMessages.size() + " error(es)\n");
        }
    }
}
