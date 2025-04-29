import java.util.Scanner;

public class Estructuras {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        // --- Variables ---
        int edad; // Variable de tipo entero

        // --- Constantes ---
        final double PI = 3.14159; // Constante de tipo double

        // --- Entrada de datos ---
        System.out.print("Ingrese su edad: ");
        edad = ingreso.nextInt();

        // --- Estructura condicional simple ---
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        // --- Estructura condicional compuesta (if - else if - else) ---
        if (edad < 13) {
            System.out.println("Es un niño");
        } else if (edad < 18) {
            System.out.println("Es un adolescente");
        } else if (edad < 60) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un adulto mayor");
        }

        // --- Estructura switch-case ---
        System.out.print("\nIngrese un número del 1 al 3: ");
        int opcion = ingreso.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción 1");
                break;
            case 2:
                System.out.println("Elegiste la opción 2");
                break;
            case 3:
                System.out.println("Elegiste la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }

        // --- Bucle while ---
        System.out.println("\nContando del 1 al 5 con while:");
        int contadorWhile = 1;
        while (contadorWhile <= 5) {
            System.out.println(contadorWhile);
            contadorWhile++;
        }

        // --- Bucle do-while ---
        System.out.println("\nContando del 6 al 10 con do-while:");
        int contadorDoWhile = 6;
        do {
            System.out.println(contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 10);

        // --- Bucle for ---
        System.out.println("\nContando del 11 al 15 con for:");
        for (int i = 11; i <= 15; i++) {
            System.out.println(i);
        }

        // --- Uso de break y continue ---
        System.out.println("\nEjemplo de break y continue en un for:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se interrumpe el ciclo en i = " + i);
                break; // Sale del bucle
            }
            if (i % 2 == 0) {
                continue; // Salta a la siguiente iteración si i es par
            }
            System.out.println("Número impar: " + i);
        }

        ingreso.close(); // Cerramos el Scanner
    }
}
