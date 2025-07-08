package unidad_IV.Map;
import java.util.*;
public class EjemploTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> puntajes = new TreeMap<>();

        puntajes.put("Carlos", 90);
        puntajes.put("Ana", 95);
        puntajes.put("Luis", 85);

        for (String nombre : puntajes.keySet()) {
            System.out.println(nombre + ": " + puntajes.get(nombre));
        }
        // Salida ordenada alfabéticamente por nombre
    }
}
