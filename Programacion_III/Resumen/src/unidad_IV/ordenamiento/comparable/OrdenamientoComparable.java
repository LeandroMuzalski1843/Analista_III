package unidad_IV.ordenamiento.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoComparable {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 30));
        personas.add(new Persona("Ana", 22));

        Collections.sort(personas); // Usa compareTo
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
