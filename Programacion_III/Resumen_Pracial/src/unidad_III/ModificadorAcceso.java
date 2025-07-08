package unidad_III;

public class ModificadorAcceso {
    public String nombre;          // Accesible desde cualquier clase
    private int edad;              // Accesible solo dentro de la clase Persona
    protected String direccion;    // Accesible desde la misma clase, subclases y paquete

    public ModificadorAcceso(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;  // forma segura de acceder a un atributo privado
    }
}
