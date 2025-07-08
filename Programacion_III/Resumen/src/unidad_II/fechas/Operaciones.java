package unidad_II.fechas;

import java.time.LocalDate;

public class Operaciones {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2024, 6, 1);
        System.out.println("Más 1 mes: " + String.valueOf(fecha.plusMonths(1L)));
        System.out.println("Menos 7 días: " + String.valueOf(fecha.minusDays(7L)));
        System.out.println("¿Es año bisiesto? " + fecha.isLeapYear());
    }
}