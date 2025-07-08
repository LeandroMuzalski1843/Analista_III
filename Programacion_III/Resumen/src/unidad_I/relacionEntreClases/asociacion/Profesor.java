package unidad_I.relacionEntreClases.asociacion;

public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void dictarClase() {
        System.out.println(this.nombre + " está dictando clase.");
    }
}