package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int valor = random.nextInt(100) + 1; // [1, 100]
            numeros.add(valor);
        }
        System.out.println("Lista generada:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();


        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma total: " + suma);


        double promedio = (double) suma / numeros.size();
        System.out.println("Promedio: " + promedio);


        System.out.println("Números mayores al promedio:");
        int contador = 0;
        for (int num : numeros) {
            if (num > promedio) {
                System.out.print(num + " ");
                contador++;
            }
        }
        System.out.println("\nCantidad de números mayores al promedio: " + contador);
    }
}