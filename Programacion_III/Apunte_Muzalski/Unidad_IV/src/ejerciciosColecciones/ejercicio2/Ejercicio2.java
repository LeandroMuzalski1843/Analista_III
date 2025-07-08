
package ejerciciosColecciones.ejercicio2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        File archivo = new File("nombres.txt");

        // Leer nombres desde el archivo al iniciar
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    nombres.add(linea.trim());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo al guardar nombres.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        int opc;

        do {
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

            switch (opc) {
                case 1:
                    System.out.print("Ingrese un nuevo nombre: ");
                    String nuevoNombre = ingreso.nextLine().trim();
                    nombres.add(nuevoNombre);
                    guardarNombresEnArchivo(nombres, archivo);
                    System.out.println("Nombre agregado y guardado correctamente.");
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
                        guardarNombresEnArchivo(nombres, archivo);
                        System.out.println("Nombre eliminado y archivo actualizado.");
                    } else {
                        System.out.println("El nombre no se encontró en la lista.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String buscar = ingreso.nextLine().trim();
                    if (nombres.contains(buscar)) {
                        System.out.println("Se encontró el nombre en la lista.");
                    } else {
                        System.out.println("No se encontró el nombre.");
                    }
                    break;

                case 5:
                    System.out.println("Cantidad total de nombres: " + nombres.size());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opc != 0);

        ingreso.close();
    }

    // Método auxiliar para guardar la lista actualizada en el archivo
    private static void guardarNombresEnArchivo(ArrayList<String> nombres, File archivo) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo))) {
            for (String nombre : nombres) {
                escritor.write(nombre);
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
}

