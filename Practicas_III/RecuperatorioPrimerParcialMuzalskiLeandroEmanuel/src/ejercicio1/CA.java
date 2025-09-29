package ejercicio1;

import java.util.Random;

public class CA {
    public static void main(String[] args) {
        //clase de prueba de metodo
        Random rand = new Random();
        String numeros = "0123456789";
        char[] pass = new char[10];

        for (int i = 0; i < pass.length; i++) {
            int aleatorio = rand.nextInt(numeros.length());
            pass[i] = numeros.charAt(aleatorio);
        }
        new String(pass);

        System.out.println(pass);
    }
}
