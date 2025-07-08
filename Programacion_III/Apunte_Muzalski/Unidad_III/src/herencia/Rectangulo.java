package herencia;

public class Rectangulo extends FijuraGeometrica implements Area{
    private double altura;
    private double base;

    public Rectangulo(String color, boolean rellenado, double altura, double base) {
        super(color, rellenado);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override //sobre escritura (polimorfismo), investigar
    public double calcularArea() {
        return this.base * this.altura;
    }
}
