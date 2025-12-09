package csv;

/**
 * Excepción personalizada para errores semánticos.
 */
public class SemanticError extends RuntimeException {
    public SemanticError(String message) {
        super(message);
    }
}