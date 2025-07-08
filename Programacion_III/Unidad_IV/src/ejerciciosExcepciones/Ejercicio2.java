package ejerciciosExcepciones;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Ingrese el primer número: ");
                int numero1 = Integer.parseInt(ingreso.nextLine());

                System.out.print("Ingrese el segundo número: ");
                int numero2 = Integer.parseInt(ingreso.nextLine());

                while (true) {
                    System.out.print("Ingrese el operador (+, -, *, /): ");
                    String operador = ingreso.nextLine();

                    switch (operador) {
                        case "+":
                            System.out.println("Resultado de la Suma: " + (numero1 + numero2));
                            break;
                        case "-":
                            System.out.println("Resultado de la Resta: " + (numero1 - numero2));
                            break;
                        case "*":
                            System.out.println("Resultado de la Multiplicación: " + (numero1 * numero2));
                            break;
                        case "/":
                            if (numero2 == 0) {
                                throw new ArithmeticException();
                            }
                            System.out.println("Resultado de la División: " + (numero1 / numero2));
                            break;
                        default:
                            System.out.println("Operador inválido. Intente nuevamente.");
                            continue; // vuelve a pedir operador
                    }
                    break;
                }

                break; // si todo fue bien, salgo del bucle principal

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero. Reinicie la operación.");
            }
        }

        ingreso.close();
    }
}

