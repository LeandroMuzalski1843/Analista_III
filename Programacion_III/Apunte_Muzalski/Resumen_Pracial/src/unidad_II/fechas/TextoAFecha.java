package unidad_II.fechas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TextoAFecha {
    public static void main(String[] args) {
        String fechaTexto = "10/05/2000";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fecha = LocalDate.parse(fechaTexto, formato);
        System.out.println("Fecha parseada: " + fecha);
    }
}
