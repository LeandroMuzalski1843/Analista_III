package unidad_II.fechas;

import java.io.PrintStream;
import java.time.LocalDate;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(2000, 5, 10);
        System.out.println("Hoy: " + String.valueOf(hoy));
        System.out.println("Nacimiento: " + String.valueOf(nacimiento));
        System.out.println("Año: " + hoy.getYear());
        System.out.println("Mes: " + String.valueOf(hoy.getMonth()));
        System.out.println("Día: " + hoy.getDayOfMonth());
        System.out.println("Día de la semana: " + String.valueOf(hoy.getDayOfWeek()));
        PrintStream var10000 = System.out;
        boolean var10001 = hoy.isAfter(nacimiento);
        var10000.println("¿Hoy es después de nacimiento? " + var10001);
        var10000 = System.out;
        var10001 = hoy.isBefore(nacimiento);
        var10000.println("¿Es antes? " + var10001);
    }
}
