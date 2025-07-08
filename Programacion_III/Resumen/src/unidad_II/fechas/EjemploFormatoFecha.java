package unidad_II.fechas;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploFormatoFecha {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy");
        PrintStream var10000 = System.out;
        String var10001 = hoy.format(formato1);
        var10000.println("Fecha formato 1: " + var10001);
        var10000 = System.out;
        var10001 = hoy.format(formato2);
        var10000.println("Fecha formato 2: " + var10001);
    }
}
