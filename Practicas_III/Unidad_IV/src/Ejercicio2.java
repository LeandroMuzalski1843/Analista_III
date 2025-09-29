public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            Exception exception = new Exception("Waripolo");
        } catch (Exception e) {
            System.out.println("mensaje catch");
            throw new RuntimeException(e);
        } finally {
            System.out.println("mensaje");
        }
    }
}
