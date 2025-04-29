package ejercicio;

public class PruebaTarjeta {
    public static void main(String[] args) {
        TarjetaCredito tarjetaCredito = new TarjetaCredito(12354,22222,"18-04-03","Leandro",5000,"VISA");
        TarjetaDebito tarjetaDebito = new TarjetaDebito(12354,22222,"18-04-03","Leandro",5000,"Mastercard");
        TarjetaDebito tarjetaDebito2 = new TarjetaDebito(12354,22222,"18-04-03","Leandro",5000,"Otros");
        TarjetaVirtual tarjetaVirtual = new TarjetaVirtual(12354,22222,"18-04-03","leandro",true);
        System.out.println("Tarjeta de Credito:"+tarjetaCredito.mostrarCategoria());
        System.out.println("Tarjeta de Debito:"+tarjetaDebito.mostrarCategoria());
        System.out.println("Tarjeta de Debito 2:"+tarjetaDebito2.mostrarCategoria());
        System.out.println("Tarjeta de Virtual:"+tarjetaVirtual.getTitular());


    }
}
