package ejerciciosMapa.ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ferreteria {
    public static void main(String[] args) {
        Map<String, Producto> inventario = new HashMap<>();
        Scanner ingreso = new Scanner(System.in);
        int opc;

        inventario.put("Clavos", new Producto("Clavos", 10));
        inventario.put("Martillo", new Producto("Martillo", 4));
        inventario.put("Destornillador", new Producto("Destornillador", 9));
        inventario.put("Moladora", new Producto("Moladora", 22));
        inventario.put("Electrodo", new Producto("Electrodo", 30));

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Vender Producto");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Buscar Producto");
            System.out.println("5. Eliminar Producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opc = ingreso.nextInt();
            ingreso.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Nombre del nuevo producto: ");
                    String nombre = ingreso.nextLine().trim();
                    System.out.println("Cantidad de stock: ");
                    int stock = ingreso.nextInt();
                    ingreso.nextLine();

                    if(inventario.containsKey(nombre)){
                        Producto existente = inventario.get(nombre);
                        existente.setStock(existente.getStock() + stock);
                        System.out.println("Producto existente. Stock actualizado.");
                    } else {
                        inventario.put(nombre,new Producto(nombre, stock));
                        System.out.println("Producto agregado al inventario.");
                    }
                    break;

                case 2:
                    System.out.println("Nombre del producto a vender");
                    String vender = ingreso.nextLine().trim();

                    if (inventario.containsKey(vender)){
                        Producto produc = inventario.get(vender);
                        if (produc.getStock() > 0){
                            produc.setStock(produc.getStock() - 1);
                            System.out.println("venta realizada. Stock restante: " + produc.getStock());
                        } else {
                            System.out.println("Sin stock disponible");
                        }
                    }else {
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 3:
                    System.out.println("--- Inventario actual ---");
                    for (Producto p : inventario.values()) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String buscar = ingreso.nextLine().trim();
                    if (inventario.containsKey(buscar)) {
                        System.out.println("Producto encontrado: " + inventario.get(buscar));
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String eliminar = ingreso.nextLine().trim();
                    if (inventario.remove(eliminar) != null) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("El producto no existe en el inventario.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }while (opc != 6);

        ingreso.close();
    }
}
