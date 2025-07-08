package ejerciciosExcepciones.ejercicio3;

import java.util.Scanner;

public class ValidarEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException{
        if(edad < 0 || edad > 120){
            throw new EdadInvalidaException("Edad invalida, debe estar entre 0 y 120");
        }
        System.out.println("Edad valida: "+ edad);
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        try {
            System.out.println("ingrese la edad: ");
            int edad = Integer.parseInt(ingreso.nextLine());
            validarEdad(edad);
        }catch (EdadInvalidaException e){
            System.out.println("Excepcion atrapada: " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Error, debe ingresar un numero");
        }

    }
}
