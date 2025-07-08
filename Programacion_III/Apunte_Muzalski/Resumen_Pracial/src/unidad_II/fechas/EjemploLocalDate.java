package unidad_II.fechas;
import java.time.LocalDate;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now(); // Fecha actual
        LocalDate nacimiento = LocalDate.of(2000, 5, 10); // Fecha específica

        System.out.println("Hoy: " + hoy);
        System.out.println("Nacimiento: " + nacimiento);

        // Métodos útiles
        System.out.println("Año: " + hoy.getYear());
        System.out.println("Mes: " + hoy.getMonth());
        System.out.println("Día: " + hoy.getDayOfMonth());
        System.out.println("Día de la semana: " + hoy.getDayOfWeek());

        // Comparaciones
        System.out.println("¿Hoy es después de nacimiento? " + hoy.isAfter(nacimiento));
        System.out.println("¿Es antes? " + hoy.isBefore(nacimiento));
    }
}
