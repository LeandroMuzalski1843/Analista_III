import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Ejercico2 {
    private float num1;
    private float num2;

    public static float sumar(float num1, float num2) {
        return num1 + num2;
    }

    public static float restar(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }

    public static float dividir(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        int opc;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float numero1 = ingreso.nextFloat();

        System.out.println("Ingrese el segundo numero: ");
        float numero2 = ingreso.nextFloat();



        do {
            System.out.println("Ingrese una de las opciones: ");
            System.out.println("1) Suma ");
            System.out.println("2) Resta ");
            System.out.println("3) Multiplicación ");
            System.out.println("4) División ");
            System.out.println("5) Salir");
            opc = ingreso.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Resultado: " + sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(numero1, numero2));
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 5);


    }
}


