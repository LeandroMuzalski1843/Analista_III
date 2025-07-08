package unidad_II.fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculoUnidadesExactas {
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2023, 1, 1);
        LocalDate fin = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(inicio, fin);
        long meses = ChronoUnit.MONTHS.between(inicio, fin);

        System.out.println("Días entre fechas: " + dias);
        System.out.println("Meses entre fechas: " + meses);
    }
}
