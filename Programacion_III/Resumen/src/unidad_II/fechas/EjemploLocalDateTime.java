package unidad_II.fechas;

import java.time.LocalDateTime;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        LocalDateTime fechaHoraFutura = fechaHoraActual.plusDays(5L).plusHours(3L);
        System.out.println("Actual: " + String.valueOf(fechaHoraActual));
        System.out.println("Futuro: " + String.valueOf(fechaHoraFutura));
    }
}
