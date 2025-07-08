package unidad_IV;

public class Excepciones {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // Error: división por cero
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }
}
