package ejercicios_arreglos;
import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String fechaNacimineto;

        System.out.println("Ingrese fecha de nacimiento");
        fechaNacimineto = ingreso.nextLine();

        DateTimeFormatter formatoDmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ahora = LocalDate.now();
        LocalDate fechaReal = LocalDate.parse(fechaNacimineto, formatoDmy);

        Period diferencia = Period.between(fechaReal, ahora);
        System.out.println("Edad: " + diferencia.getYears());

    }
}
