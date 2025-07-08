package unidad_IV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploListas {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();   // Lista con acceso rápido
        List<String> lista2 = new LinkedList<>();  // Lista con inserción eficiente

        lista1.add("Java");
        lista1.add("Python");

        for (String lenguaje : lista1) {
            System.out.println(lenguaje);
        }
    }
}
