package unidad_IV.ordenamiento.comparator;
import java.util.*;
public class OrdenamientoComparator {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Zorro", "Casa", "Árbol");

        // Orden alfabético inverso
        palabras.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a); // Inverso
            }
        });

        System.out.println(palabras);
    }
}
