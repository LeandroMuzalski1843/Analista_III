package ejercicio2;

public class Contratado extends Persona{
    protected int duracionMeses;

    public Contratado(String nombre, String dni, int duracionMeses) {
        super(nombre, dni);
        this.duracionMeses = duracionMeses;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }
}
