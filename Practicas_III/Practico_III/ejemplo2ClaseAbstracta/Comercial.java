package ejemplo2ClaseAbstracta;

public class Comercial extends Empleado{
    public Comercial(int dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public void calcularSueldo() {
    }

    @Override
    public void calcularSueldo(float comision) {
        setBasico(getBasico()+(float) (getBasico()*comision));
    }
}
