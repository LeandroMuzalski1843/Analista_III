package unidad_I;

//Consiste en ocultar los datos internos y acceder a ellos mediante métodos públicos.

public class Encapsulamiento {
    private double saldo;

    //public CuentaBancaria
    public Encapsulamiento(double saldoInicial){
        saldo = saldoInicial;
    }
    public void depositar(double monto) {
        if (monto > 0) saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Encapsulamiento cuenta = new Encapsulamiento(1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}

