package unidad_III;

public class Constructores {
    private String nombre;
    private int edad;

    //Constructor 1

    public Constructores() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Constructor 2 (sobrecargado)
    public Constructores(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Destructor (no se recomienda usar finalize en producción)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objeto Alumno destruido.");
    }


}
