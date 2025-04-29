package ejercicios_arreglos;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);
        int[] numerosAleatorios = new int[10];
        int cont = 0;
        int numUsuario;

        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
            int numero = r.nextInt(11-1) + 1;
            numerosAleatorios[i]=numero;
        }

        System.out.println("Ingrese un numero: ");
        numUsuario = ingreso.nextInt();
        for (int i = 0; i <numerosAleatorios.length; i++) {
            if (numerosAleatorios[i] == numUsuario){
                cont++;
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("Nota "+ (i+1) + ": "+  numerosAleatorios[i]);
        }
        System.out.println("Cantidad de coincidencias: " + cont);
    }
}
