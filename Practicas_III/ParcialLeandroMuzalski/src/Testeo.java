public class Testeo {
    public static void main(String[] args) {
        Producto producto = new Producto("Paracetamol",300);
        Cliente cliente = new Cliente("Leandro");
        FormaDePago formaDePago = new Efectivo(10);
        Farmacia farmacia = new Farmacia(producto,cliente,formaDePago);



    }
}
