package unidad_IV.crearExcepciones;

public class ExcepcionPersonalizada {
    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("Edad no válida: debe ser mayor de 18.");
        }
    }

    public static void main(String[] args) {
        try {
            verificarEdad(16);
        } catch (EdadInvalidaException e) {
            System.out.println("Error personalizado: " + e.getMessage());
        }
    }
}
