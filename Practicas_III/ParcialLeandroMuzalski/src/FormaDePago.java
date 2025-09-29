public abstract class FormaDePago {
    private int porcentaje;

    public FormaDePago(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public abstract float calcularPrecio(float monto);
}
