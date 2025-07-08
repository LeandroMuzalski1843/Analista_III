package ejercicio4;

public abstract class Producto {
    private String nombre;
    private double precio;
    private Proveedor proveedor;

    public Producto(String nombre, double precio, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public abstract double calcularPrecioFinal();

    public abstract void mostrarDetalle();
}
