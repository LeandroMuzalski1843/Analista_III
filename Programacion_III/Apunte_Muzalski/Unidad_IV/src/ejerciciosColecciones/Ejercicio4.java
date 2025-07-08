package ejerciciosColecciones;

import java.util.Stack;

public class Ejercicio4 {
    public static void main(String[] args) {
        Stack<String> pilaLibros = new Stack<>();

        pilaLibros.push("Mi planta de naranja lima");
        pilaLibros.push("El velero de cristal");
        pilaLibros.push("Don Quijote de la Mancha");
        pilaLibros.push("Elenor y Park");
        pilaLibros.push("El caballero de la armadura oxidada");

        if (!pilaLibros.isEmpty()) {
            System.out.println("Libro en la parte superior: " + pilaLibros.peek());
        }

        System.out.println("\nRetirando libros: ");
        while (!pilaLibros.isEmpty()){
            System.out.println("Se retiro: " + pilaLibros.pop());
        }

        if (pilaLibros.isEmpty()){
            System.out.println("La pila esta vacia");
        }


    }
}
