package ejemplo2ClaseAbstracta;

public class Administrativo extends Empleado{
    int antiguedad;

    public Administrativo(int dni, String nombre, int antiguedad) {
        super(dni, nombre);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void calcularSueldo() {

    }
}
