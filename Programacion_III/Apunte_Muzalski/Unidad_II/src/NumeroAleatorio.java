import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numero = (int) (Math.random() *100);
        int vidas = 5;
        Scanner ingreso = new Scanner(System.in);
        int intento;
        System.out.println("Se ha generado un numero aleatorio");
        while (vidas >0){
            System.out.println("ingrese un numero entre 1 y 100: ");
            intento = ingreso.nextInt();
            if(intento == numero){
                System.out.println("Ganaste, le pegaste al numero...... ahora al casino");
                break;
            } else {
                if (intento < numero) {
                    System.out.println("el numero es mas grande");
                } else {
                    System.out.println("El numero es mas chico");
                }
                vidas--;
            }
        }
        if (vidas ==0){
            System.out.println("Perdiste, no tenes mas vidas" + "el numero era: "+ numero);
        }
    }
}

