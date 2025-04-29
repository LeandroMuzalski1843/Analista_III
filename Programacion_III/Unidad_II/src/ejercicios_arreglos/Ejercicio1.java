package ejercicios_arreglos;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 numeros enteros");
        for (int i = 0; i <numeros.length; i++) {
            System.out.print("Numero "+ (i + 1) + ": ");
            numeros[i]= ingreso.nextInt();
        }

        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Posicion "+ i + ": "+ numeros[i]);
        }
    }
}
