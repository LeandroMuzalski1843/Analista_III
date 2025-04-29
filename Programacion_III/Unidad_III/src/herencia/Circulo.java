package herencia;

public class Circulo extends FijuraGeometrica implements Area{
    private double radio;
    //Atributo de clase, solo se puede invocar mediante la clase
    private static int cantidadObjetos = 0;


    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
        cantidadObjetos++;
    }

    public Circulo(double radio, String color, boolean rellenado) {
        super(color,rellenado);
        this.radio = radio;
        cantidadObjetos++;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
    }

    //Metodo de clase, solo se puede invocar mediante la clase
    public static int getCantidadObjetos(){
        return Circulo.cantidadObjetos;
    }
}
