package ejercicios_arreglos;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatoDmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaEvento;

        System.out.println("Ingrese la fecha de su evento (dd/MM/yyyy)");
        fechaEvento = input.nextLine();

        LocalDate fechaReal = LocalDate.parse(fechaEvento, formatoDmy);
        if (fechaReal.isBefore(LocalDate.now())){
            System.out.println("El evento es valido");
        } else {
            System.out.println("El evento ya ha pasado");
        }

    }
}
