package unidad_IV;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Rojo");
        conjunto.add("Azul");
        conjunto.add("Rojo"); // Duplicado, no se agrega

        for (String color : conjunto) {
            System.out.println(color); // No hay repetidos
        }
    }
}
