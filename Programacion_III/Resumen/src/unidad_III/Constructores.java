package unidad_III;

public class Constructores {
    private String nombre;
    private int edad;

    public Constructores() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public Constructores(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    protected void finalize() throws Throwable {
        System.out.println("Objeto Alumno destruido.");
    }
}
