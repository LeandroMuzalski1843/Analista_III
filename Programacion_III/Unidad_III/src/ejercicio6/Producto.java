package ejercicio6;

public class Producto {
    private int id;
    private String descripcion;
    private int precio;
    private Categoria categoria;
    private int stock;

    public Producto(int id, String descripcion, int precio, Categoria categoria, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }
    public Producto(int id, String descripcion, int precio, int stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double precioDecimal(int precio){
        return 0;
    }
    public String detalles(){
        return "Producto{" +
                "id=" + id +
                ", descripcion='" + this.descripcion + '\'' +
                ", precio=" + this.precio +
                ", categoria=" + this.categoria +
                ", stock=" + this.stock +
                '}';
    }
}
