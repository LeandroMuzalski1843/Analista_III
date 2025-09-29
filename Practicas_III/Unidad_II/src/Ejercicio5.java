import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Contar vocales usando charAt
        System.out.print("Ingrese una cadena para contar las vocales: ");
        String cadena = scanner.nextLine();
        int contadorVocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Cantidad de vocales: " + contadorVocales);

        // b. Convertir a mayúsculas e imprimir longitud
        String mayusculas = cadena.toUpperCase();
        int longitud = cadena.length();
        System.out.println("Cadena en mayúsculas: " + mayusculas);
        System.out.println("Longitud de la cadena: " + longitud);

        // c. Reemplazar un carácter por otro si existe
        System.out.print("Ingrese un carácter a reemplazar: ");
        char original = scanner.next().charAt(0);

        System.out.print("Ingrese el nuevo carácter: ");
        char nuevo = scanner.next().charAt(0);

        String cadenaReemplazada = cadena.replace(original, nuevo);
        System.out.println("Cadena resultante: " + cadenaReemplazada);

        scanner.nextLine(); // Limpiar buffer antes del próximo ingreso

        // d. Comparar dos cadenas sin importar mayúsculas/minúsculas
        System.out.print("Ingrese la primera cadena para comparar: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena para comparar: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas).");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}
