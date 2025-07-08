package unidad_IV;
import java.util.*;

public class Iteradores {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Manzana", "Pera", "Banana");

        // For-each
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Iterator
        Iterator<String> it = frutas.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }
    }
}
