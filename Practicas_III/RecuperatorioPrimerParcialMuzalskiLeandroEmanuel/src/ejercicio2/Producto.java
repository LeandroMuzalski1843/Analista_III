package ejercicio2;

public class Producto {
    private String condigo;
    private String nombre;
    private double precioUnitario;
    private int stock;

    public Producto(String condigo, String nombre, double precioUnitario, int stock) {
        this.condigo = condigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public String getCondigo() {
        return condigo;
    }

    public void setCondigo(String condigo) {
        this.condigo = condigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reducirStock(int cantidad) throws StockInsuficienteException{
        if(stock>cantidad && cantidad>0){
            stock -= cantidad;
            return;
        }
        throw new StockInsuficienteException("No hay suficiente para "+cantidad +" unidades del producto "+nombre +". Stock disponible:"+ stock);

    }
    public void aumentarStock(int cantidad){
        if(cantidad>0){
            stock += cantidad;
        } else {
            System.out.println("La cantidad tiene que ser mayor a 0");
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "condigo='" + condigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                '}';
    }
}
