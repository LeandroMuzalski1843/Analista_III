package unidad_IV.ordenamiento.comparable;
import java.util.*;
public class Persona implements Comparable<Persona> {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return this.edad - otra.edad; // Orden por edad ascendente
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

