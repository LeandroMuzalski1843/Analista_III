public class Farmacia {
    private Producto producto;
    private Cliente cliente;
    private FormaDePago formaDePago;

    public Farmacia(Producto producto, Cliente cliente, FormaDePago formaDePago) {
        this.producto = producto;
        this.cliente = cliente;
        this.formaDePago = formaDePago;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public static void vender(Producto producto,Cliente cliente, FormaDePago formaDePago){
        System.out.println("El cliente "+ cliente.getNombre() +
                " compro el producto "+ producto.getDescripcion() +
                " al precio "+ formaDePago.calcularPrecio(producto.getPrecio()));
    }

    public static void main(String[] args) {
        Producto producto = new Producto("Paracetamol",300);
        Cliente cliente = new Cliente("Leandro");
        FormaDePago formaDePago = new Credito(10);
        vender(producto,cliente,formaDePago);
    }

}
