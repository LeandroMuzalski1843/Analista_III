package unidad_II;

public class ManejoCadenas {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.println("Longitud: " + texto.length());
        System.out.println("Subcadena: " + texto.substring(0, 4));
        System.out.println("¿Es igual a 'hola mundo'? " + texto.equals("hola mundo"));
    }
}