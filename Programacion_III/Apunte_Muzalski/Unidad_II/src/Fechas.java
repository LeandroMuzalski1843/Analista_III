import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static void main(String[] args) {

        //Clae antigua
        Date FechaTradicional = new Date();
        System.out.println(FechaTradicional);

        //LocalDate = Fecha actualizada
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        LocalDate fechaRecepcion = LocalDate.of(2025,12,10);
        System.out.println("El año es: " + fechaRecepcion.getYear());
        LocalDate fechaViajeSalta = fechaRecepcion.plusDays(5);
        LocalDate fechaBookFotos = fechaRecepcion.minusDays(10);

        //LocalTime
        LocalTime horActual = LocalTime.now();
        System.out.println("Ahora son las" + horActual);
        LocalTime horaEspecifica = LocalTime.of(4,30);

        //LocalDateTime
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println(ahora);

        //Comparar 2 fechas
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(2025,04,18);
        if (hoy.isBefore(cumple)){
            System.out.println("Todavia falta para el cumple");
        } else if (hoy.isAfter(cumple)) {
            System.out.println("Ya paso tu cumple");
        } else {
            System.out.println("Feliz cumple");
        }

        //Formatear Fechas en d/m/y
        DateTimeFormatter formatoDmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFotmateada = hoy.format(formatoDmy);
        System.out.println("Fecha formateada: "+ fechaFotmateada);

        //Crear una fecha via una cadena
        String fechaTexto = "10/04/2025";
        LocalDate fechaReal = LocalDate.parse(fechaTexto, formatoDmy);
        System.out.println(fechaReal.plusDays(1));

        //Calcular diferencia entre fechas
        LocalDate fechaInicio = LocalDate.of(2025,1,1);
        LocalDate fechaFin = LocalDate.of(2025,5,1);
        Period diferencia = Period.between(fechaInicio,fechaFin);
        System.out.println("Dias: "+ diferencia.getDays());

        //Convertir entre Date y LocalDate
        Date fechaDateAhora = new Date();
        //Convertir a LocalDate
        LocalDate nuevaFechaCopada = fechaDateAhora.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("Date: " + fechaDateAhora);
        System.out.println("LocalDate: "+ nuevaFechaCopada);

        //Convertir de LocalDate a Date
        Date otraFechaFea = Date.from(nuevaFechaCopada.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date: " + otraFechaFea);
        System.out.println("LocalDate: " + nuevaFechaCopada);

    }
}
