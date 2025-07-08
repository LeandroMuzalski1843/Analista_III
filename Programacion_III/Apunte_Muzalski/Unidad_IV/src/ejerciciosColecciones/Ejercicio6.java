package ejerciciosColecciones;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        Set<String> listaCompras = new HashSet<>();

        System.out.println("=== Lista de Compras del Supermercado ===");
        String opcion;

        do {
            System.out.println("Ingrese un producto: ");
            String producto = ingreso.nextLine().trim();

            if (producto.isEmpty()){
                System.out.println("No se puede ingresar un producto vacio");
            } else if (listaCompras.contains(producto)) {
                System.out.println("el producto ta esta en la lista");
            } else {
                listaCompras.add(producto);
                System.out.println("Producto agregado");
            }
            System.out.println("Desea agregar otro producto s/n: ");
            opcion = ingreso.nextLine().trim().toLowerCase();

        }while (opcion.equals("s"));

        System.out.println("\n=== Lista Final de Compras ===");
        if (listaCompras.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (String producto : listaCompras) {
                System.out.println("- " + producto);
            }
        }

        ingreso.close();

    }
}
