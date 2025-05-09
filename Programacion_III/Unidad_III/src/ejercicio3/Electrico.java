package ejercicio3;

public class Electrico extends Vehiculo implements Conctable{
    private int autonomia;

    public Electrico(String marca, String modelo, int anio, int autonomia) {
        super(marca, modelo, anio);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void conectar() {
        System.out.printf("Iniciando la carga del vehiculo");
    }
}
