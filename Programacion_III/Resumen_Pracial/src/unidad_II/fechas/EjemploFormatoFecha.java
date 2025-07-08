package unidad_II.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploFormatoFecha {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();

        // Formato personalizado
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy");

        System.out.println("Fecha formato 1: " + hoy.format(formato1));
        System.out.println("Fecha formato 2: " + hoy.format(formato2));
    }
}
