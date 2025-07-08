package unidad_II.fechas;
import java.time.LocalDate;

public class Operaciones {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2024, 6, 1);

        // Sumar y restar
        System.out.println("Más 1 mes: " + fecha.plusMonths(1));
        System.out.println("Menos 7 días: " + fecha.minusDays(7));

        // Comparaciones
        System.out.println("¿Es año bisiesto? " + fecha.isLeapYear());
    }
}
