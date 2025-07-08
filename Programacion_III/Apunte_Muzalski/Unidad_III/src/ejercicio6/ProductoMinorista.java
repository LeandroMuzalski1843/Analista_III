package ejercicio6;

public class ProductoMinorista extends Producto{
    private int porcentajeDescuentoEfectivo;
    private int porcentajeRecargaCredito;

    public ProductoMinorista(int id, String descripcion, int precio, Categoria categoria, int stock, int porcentajeDescuentoEfectivo, int porcentajeRecargaCredito) {
        super(id, descripcion, precio, categoria, stock);
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
        this.porcentajeRecargaCredito = porcentajeRecargaCredito;
    }

    public ProductoMinorista(int id, String descripcion, int precio, int stock, int porcentajeDescuentoEfectivo, int porcentajeRecargaCredito) {
        super(id, descripcion, precio, stock);
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
        this.porcentajeRecargaCredito = porcentajeRecargaCredito;
    }

    public int getPorcentajeDescuentoEfectivo() {
        return porcentajeDescuentoEfectivo;
    }

    public void setPorcentajeDescuentoEfectivo(int porcentajeDescuentoEfectivo) {
        this.porcentajeDescuentoEfectivo = porcentajeDescuentoEfectivo;
    }

    public int getPorcentajeRecargaCredito() {
        return porcentajeRecargaCredito;
    }

    public void setPorcentajeRecargaCredito(int porcentajeRecargaCredito) {
        this.porcentajeRecargaCredito = porcentajeRecargaCredito;
    }
}
