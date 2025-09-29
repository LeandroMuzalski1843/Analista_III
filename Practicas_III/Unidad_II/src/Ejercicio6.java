import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        double potencia = Math.pow(mayor, menor);

        System.out.println("El menor número es: " + menor);
        System.out.println(mayor + " elevado a " + menor + " es: " + potencia);

    }
}
