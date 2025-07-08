package ejerciciosColecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Leo");
        nombres.add("Pola");
        nombres.add("Karen");
        nombres.add("Noah");

        Scanner ingreso = new Scanner(System.in);
        int opc;

        do{
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ingresar nuevos nombres");
            System.out.println("2. Mostrar todos los nombres");
            System.out.println("3. Eliminar un nombre puntual");
            System.out.println("4. Buscar un nombre");
            System.out.println("5. Mostrar cantidad de nombres");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = ingreso.nextInt();
            ingreso.nextLine();  // Limpiar el buffer

            switch (opc){
                case 1:
                    System.out.print("Ingrese un nuevo nombre: ");
                    //trim elimina los espacios en blanco al inicio y al final
                    String nuevoNombre = ingreso.nextLine().trim();
                    nombres.add(nuevoNombre);
                    System.out.println("Nombre agregado correctamente.");
                    break;

                case 2:
                    if (nombres.isEmpty()) {
                        System.out.println("No hay nombres cargados.");
                    } else {
                        System.out.println("Nombres guardados:");
                        for (String nombre : nombres) {
                            System.out.println("- " + nombre);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a eliminar: ");
                    String eliminar = ingreso.nextLine().trim();
                    if (nombres.remove(eliminar)) {
                        System.out.println("Nombre eliminado correctamente.");
                    } else {
                        System.out.println("El nombre no se encontró en la lista.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre a busar: ");
                    String nombreBuscar = ingreso.nextLine().trim();
                    if (nombres.contains(nombreBuscar)){
                        System.out.println("Se encontro el nombre en la lista");
                    } else {
                        System.out.println("No se encontro el nombre en la lista");
                    }
                    break;

                case 5:
                    System.out.println("Cantidad total de nombres: " + nombres.size());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        }while (opc != 0);
        ingreso.close();
    }
}
