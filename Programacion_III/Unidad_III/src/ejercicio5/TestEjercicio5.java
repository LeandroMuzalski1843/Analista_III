package ejercicio5;
import java.time.LocalDateTime;
public class TestEjercicio5 {
    public static void main(String[] args) {
        Turno t1 = new Turno(LocalDateTime.now(),LocalDateTime.now().plusDays(2),
                LocalDateTime.now().plusDays(2).plusMinutes(15), new Mascota("felipito",2,"doberman",
                new Dueno(
                        "Felipe",
                        "3755-231232"
                ),40 ),new Veterinario("Felipote","123123123",new Especialidad("Dr","Especialista en animales")),
                new Servicio("Peluqueria",30,15,10));
        System.out.println("Cantidad dias restantes: " + t1.calcularDiasRestantes());

        System.out.println("El costo total del servicio es de: "+t1.calcularCostoTotal());
    }
}
