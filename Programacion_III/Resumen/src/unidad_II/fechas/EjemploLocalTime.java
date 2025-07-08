package unidad_II.fechas;

import java.time.LocalTime;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        LocalTime horaFija = LocalTime.of(14, 30);
        System.out.println("Hora actual: " + String.valueOf(ahora));
        System.out.println("Hora fija: " + String.valueOf(horaFija));
        System.out.println("Dentro de 1 hora: " + String.valueOf(ahora.plusHours(1L)));
        System.out.println("15 minutos antes: " + String.valueOf(ahora.minusMinutes(15L)));
    }
}
