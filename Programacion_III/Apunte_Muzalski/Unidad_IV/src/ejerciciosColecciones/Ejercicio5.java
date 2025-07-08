package ejerciciosColecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio5 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Carlos");
        cola.add("Lucía");
        cola.add("Marta");
        cola.add("Julián");

        while (!cola.isEmpty()){
            //quita y devuelve el primero
            String persona = cola.poll();
            System.out.println("Atendiendo a " + persona);
            System.out.println("Personas restantes en la cola: " + cola.size());
            System.out.println("--------------------------------------");

        }
        System.out.println("Cola vacía, todas las personas fueron atendidas.");
    }
}
