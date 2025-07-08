package ejercicio6;

public class ProductoMayorista extends Producto{
    private int precioMayorista;
    private int porcentajeDescuento;

    public ProductoMayorista(int id, String descripcion, int precio, Categoria categoria, int stock, int precioMayorista, int porcentajeDescuento) {
        super(id, descripcion, precio, categoria, stock);
        this.precioMayorista = precioMayorista;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public ProductoMayorista(int id, String descripcion, int precio, int stock, int precioMayorista, int porcentajeDescuento) {
        super(id, descripcion, precio, stock);
        this.precioMayorista = precioMayorista;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(int precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
