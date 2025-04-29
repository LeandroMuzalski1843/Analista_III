package ejercicios_arreglos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int[] notas = new int[4];
        float promedio = 0;

        for (int i = 0; i <4; i++) {
            System.out.println("Ingrese una nota: ");
            notas[i]= ingreso.nextInt();
            while (notas[i]<0 || notas[i] >10){
                System.out.println("Nota invalida, reingrese: ");
                notas[i]= ingreso.nextInt();
            }
            promedio = promedio + notas[i];
        }

        System.out.println("Las notas son: ");
        for (int i = 0; i <notas.length; i++) {
            System.out.println("Nota "+ (i+1) + ": "+ notas[i]);
        }
        System.out.println("Promedio: "+(promedio/4));
    }
}
