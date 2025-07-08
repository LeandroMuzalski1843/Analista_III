package unidad_IV.Map;
import java.util.*;

public class EjemploLinkHashMap {
    public static void main(String[] args) {
        Map<String, String> paises = new LinkedHashMap<>();
        paises.put("AR", "Argentina");
        paises.put("BR", "Brasil");
        paises.put("CL", "Chile");

        for (String codigo : paises.keySet()) {
            System.out.println(codigo + " -> " + paises.get(codigo));
        }
    }
}
