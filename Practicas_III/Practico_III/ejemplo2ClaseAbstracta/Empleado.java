package ejemplo2ClaseAbstracta;

public abstract class Empleado {

    private int dni;
    private String nombre;
    private float basico;

    public Empleado(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.basico = 10000;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBasico() {
        return basico;
    }

    public void setBasico(float basico) {
        this.basico = basico;
    }

    public abstract void calcularSueldo();

    public abstract void calcularSueldo(float comision);
}
