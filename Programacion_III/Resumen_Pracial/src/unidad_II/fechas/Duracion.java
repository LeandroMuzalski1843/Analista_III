package unidad_II.fechas;
import java.time.Duration;
import java.time.LocalTime;

public class Duracion {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(8, 0);
        LocalTime fin = LocalTime.of(10, 30);

        Duration duracion = Duration.between(inicio, fin);

        System.out.println("Duración en minutos: " + duracion.toMinutes());
        System.out.println("Duración en horas: " + duracion.toHours());
    }
}
