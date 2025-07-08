package ejercicio2;

public class Obrero extends Contratado{
    private double montoQuincenal;


    public Obrero(String nombre, String dni, int duracionMeses, double montoQuincenal) {
        super(nombre, dni, duracionMeses);
        this.montoQuincenal = montoQuincenal;
    }

    public double getMontoQuincenal() {
        return montoQuincenal;
    }

    public void setMontoQuincenal(double montoQuincenal) {
        this.montoQuincenal = montoQuincenal;
    }

    public double calcularFacturaTotal(){
        return (this.duracionMeses*2)*this.montoQuincenal;
    }
}
