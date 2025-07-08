package ejerciciosExcepciones.ejercicio3;

public class EdadInvalidaException extends RuntimeException {
    public EdadInvalidaException(String message) {
        super(message);
    }
}
