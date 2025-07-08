package ejercicio6;

import java.time.LocalDate;

public class Oferta {
    private ProductoMinorista[] producto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int porcentajeDescuento;

    public Oferta(ProductoMinorista[] producto, LocalDate fechaInicio, LocalDate fechaFin, int porcentajeDescuento) {
        this.producto = producto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public ProductoMinorista[] getProducto() {
        return producto;
    }

    public void setProducto(ProductoMinorista[] producto) {
        this.producto = producto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
