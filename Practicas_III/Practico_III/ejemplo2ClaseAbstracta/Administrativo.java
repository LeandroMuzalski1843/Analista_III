package ejemplo2ClaseAbstracta;

public class Administrativo extends Empleado {
    private int antiguedad;

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
        if (this.antiguedad >=1 && this.antiguedad <=3){
            setBasico((float) (getBasico()+(getBasico()*0.5)));
        } else if (this.antiguedad >= 4 && this.antiguedad <= 10) {
            setBasico((float) (getBasico()+(getBasico()*0.15)));
        } else if (this.antiguedad >=11 && this.antiguedad<=20) {
            setBasico((float) (getBasico()+(getBasico()*0.50)));
        } else {
            setBasico((float) (getBasico()+(getBasico()*0.75)));
        }
    }

    @Override
    public void calcularSueldo(float comision) {}
}
