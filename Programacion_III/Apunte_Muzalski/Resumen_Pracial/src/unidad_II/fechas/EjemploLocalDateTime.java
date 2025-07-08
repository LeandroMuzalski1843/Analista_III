package unidad_II.fechas;

import java.time.LocalDateTime;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        LocalDateTime fechaHoraFutura = fechaHoraActual.plusDays(5).plusHours(3);

        System.out.println("Actual: " + fechaHoraActual);
        System.out.println("Futuro: " + fechaHoraFutura);
    }
}
