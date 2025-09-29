import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double CUOTA_BASE = 400.0;
        double cuotaFinal = CUOTA_BASE;

        System.out.print("Ingrese la edad del socio: ");
        int edad = scanner.nextInt();

        if (edad > 65) {
            cuotaFinal = CUOTA_BASE * 0.60; // 40% de descuento
        } else if (edad < 21) {
            System.out.print("¿Los padres son socios? (s/n): ");
            char padresSocios = scanner.next().toLowerCase().charAt(0);

            if (padresSocios == 's') {
                cuotaFinal = CUOTA_BASE * 0.55; // 45% de descuento
            } else {
                cuotaFinal = CUOTA_BASE * 0.75; // 25% de descuento
            }
        } else {
            cuotaFinal = CUOTA_BASE; // sin descuento
        }

        System.out.println("La cuota a abonar es: $" + cuotaFinal);
    }

}
