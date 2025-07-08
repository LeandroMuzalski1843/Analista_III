package ejerciciosExcepciones;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        while (true){
            System.out.println("Ingrese un numero: ");
            try{
                int numero = Integer.parseInt(ingreso.nextLine()); //Convierte el String en un número entero.
                for(int i = 0; i < numero; i++){
                    System.out.println("Exito");
                }
                break;
            } catch (NumberFormatException e){
                System.out.println("Error: debe ingresar un numero");
            }
        }

        ingreso.close();

    }
}
