package unidad_I.relacionEntreClases.asociacion;

// Asociación
public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void dictarClase() {
        System.out.println(nombre + " está dictando clase.");
    }
}
