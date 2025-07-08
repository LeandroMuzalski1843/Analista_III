package unidad_III;

public class ModificadorAcceso {
    public String nombre;
    private int edad;
    protected String direccion;

    public ModificadorAcceso(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getEdad() {
        return this.edad;
    }
}