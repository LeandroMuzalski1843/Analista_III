package ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Leandro Muzalski");
        CuentaBancaria c2 = new CuentaBancaria("Cristian Muzalski",123);



        System.out.println("Numero de cuenta: "+c1.getNumeroDeCuenta());
        System.out.println("Saldo Actual: "+c1.getSaldoActualCuenta());
        c1.depositar(1000);
        System.out.println("Saldo Actual: "+c1.getSaldoActualCuenta());
        c1.retirar(1000);
        System.out.println("Saldo Actual: "+c1.getSaldoActualCuenta());
        System.out.println("numero de cuenta: "+c1.getNumeroDeCuenta()+", titular: "+c1.getNombreTitular()+" saldo: "+ c1.getSaldoActualCuenta()+" "+c1.esActiva());

        System.out.println("Numero de cuenta: "+c2.getNumeroDeCuenta());
        System.out.println("Saldo Actual: "+c2.getSaldoActualCuenta());
        c2.depositar(1000);
        System.out.println("Saldo Actual: "+c2.getSaldoActualCuenta());
        c2.retirar(500);
        System.out.println("Saldo Actual: "+c2.getSaldoActualCuenta());
        System.out.println("numero de cuenta: "+c2.getNumeroDeCuenta()+", titular: "+c2.getNombreTitular()+" saldo: "+ c2.getSaldoActualCuenta()+" "+c2.esActiva());


    }
}
