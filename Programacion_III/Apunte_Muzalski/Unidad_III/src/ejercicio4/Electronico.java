package ejercicio4;

public class Electronico extends Producto{
    private int mesesGarantia;

    public Electronico(String nombre, double precio, Proveedor proveedor, int mesesGarantia) {
        super(nombre, precio, proveedor);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Producto: "+ getNombre() + " Precio: " + getPrecio() + " Proovedor: " + getProveedor().getDatosContactos() + " y mes de garantia: " + getMesesGarantia());
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio()*0.25 + getPrecio();
    }
}
