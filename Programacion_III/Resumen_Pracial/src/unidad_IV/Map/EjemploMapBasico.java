package unidad_IV.Map;
import java.util.*;
public class EjemploMapBasico {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos
        edades.put("Ana", 25);
        edades.put("Luis", 30);
        edades.put("Marta", 28);

        // Obtener valor por clave
        System.out.println("Edad de Luis: " + edades.get("Luis"));

        // Verificar si existe una clave
        System.out.println("¿Existe Ana? " + edades.containsKey("Ana"));

        // Recorrer el mapa con for-each
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años.");
        }

        // Recorrer con entrySet
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // Remover elemento
        edades.remove("Ana");

        // Tamaño
        System.out.println("Total de entradas: " + edades.size());

        // Reemplazar valor
        edades.replace("Luis", 35);
    }
}
