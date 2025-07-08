package unidad_II.fechas;

import java.time.LocalDate;
import java.time.Period;

public class CalculoEntreFechas {
    public CalculoEntreFechas() {
    }

    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2000, 5, 10);
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(nacimiento, hoy);
        System.out.println("Años: " + edad.getYears());
        System.out.println("Meses: " + edad.getMonths());
        System.out.println("Días: " + edad.getDays());
    }
}