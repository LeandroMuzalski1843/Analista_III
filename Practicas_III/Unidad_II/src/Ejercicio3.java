import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingrese el primer numero: ");
        int numero1 = ingreso.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = ingreso.nextInt();

        if (numero1>numero2){
            for (int i = numero2+1; i <numero1; i++) {
                cont ++;
            }
            System.out.println("Inicio: "+numero2 + " fin: "+numero1 + " cantidad de numeros en medio: "+cont);
        } else if (numero2>numero1) {
            for (int i = numero1+1; i <numero2; i++) {
                cont ++;
            }
            System.out.println("Inicio: "+numero1 + " fin: "+numero2 + " cantidad de numeros en medio: "+cont);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

}
