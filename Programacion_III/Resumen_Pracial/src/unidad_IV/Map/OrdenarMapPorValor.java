package unidad_IV.Map;
import java.util.*;
public class OrdenarMapPorValor {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Juan", 7);
        notas.put("Ana", 10);
        notas.put("Pedro", 5);

        // Convertimos a lista
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(notas.entrySet());

        // Ordenamos por valor
        lista.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entrada : lista) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}
