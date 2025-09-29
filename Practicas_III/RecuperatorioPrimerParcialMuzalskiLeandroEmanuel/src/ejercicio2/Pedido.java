package ejercicio2;

import java.time.LocalDate;
import java.util.Map;

public class Pedido {
    private String idPedido;
    private LocalDate fechaPedido;
    Map<Producto, Integer> productosVendidos;
    private double totalPedido;

    public Pedido(String idPedido, LocalDate fechaPedido) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Map<Producto, Integer> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(Map<Producto, Integer> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public void agregarProducto(Producto producto, int cantidad){
        if(!(productosVendidos.containsKey(producto))) {
            productosVendidos.put(producto, cantidad);
            totalPedido += cantidad;
        } else {
            System.out.println("producto existente");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido='" + idPedido + '\'' +
                ", fechaPedido=" + fechaPedido +
                ", totalPedido=" + totalPedido +
                '}';
    }
}
