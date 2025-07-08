package unidad_II.fechas;
import java.time.LocalTime;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now(); // Hora actual
        LocalTime horaFija = LocalTime.of(14, 30); // 14:30

        System.out.println("Hora actual: " + ahora);
        System.out.println("Hora fija: " + horaFija);

        // Operaciones con tiempo
        System.out.println("Dentro de 1 hora: " + ahora.plusHours(1));
        System.out.println("15 minutos antes: " + ahora.minusMinutes(15));
    }
}
