package epp;

import java.util.HashMap;
import java.util.Map;

/**
 * Tabla de símbolos para gestionar variables durante la compilación.
 * Asigna índices de variables locales de Jasmin automáticamente.
 */
public class SymbolTable {
    
    private Map<String, Variable> variables;
    private int nextLocalIndex;
    
    public SymbolTable() {
        this.variables = new HashMap<>();
        this.nextLocalIndex = 1; // locals[0] reservado para args del main
    }
    
    public static class Variable {
        public String name;
        public int localIndex;
        public VarType type;
        
        public Variable(String name, int localIndex, VarType type) {
            this.name = name;
            this.localIndex = localIndex;
            this.type = type;
        }
    }
    
    public enum VarType {
        INT, STRING, BOOLEAN, UNKNOWN
    }
    
    // Registra una variable nueva o devuelve la existente
    public Variable declareVariable(String name, VarType type) {
        if (variables.containsKey(name)) {
            return variables.get(name);
        }
        
        Variable var = new Variable(name, nextLocalIndex++, type);
        variables.put(name, var);
        return var;
    }
    
    public Variable getVariable(String name) {
        return variables.get(name);
    }
    
    public boolean hasVariable(String name) {
        return variables.containsKey(name);
    }
    
    // Devuelve cuántas variables locales necesitamos (para .limit locals)
    public int getMaxLocals() {
        return nextLocalIndex;
    }
    
    public VarType inferType(String value) {
        if (value.equals("verdadero") || value.equals("falso")) {
            return VarType.BOOLEAN;
        }
        if (value.startsWith("\"") && value.endsWith("\"")) {
            return VarType.STRING;
        }
        try {
            Integer.parseInt(value);
            return VarType.INT;
        } catch (NumberFormatException e) {
            return VarType.UNKNOWN;
        }
    }
}
