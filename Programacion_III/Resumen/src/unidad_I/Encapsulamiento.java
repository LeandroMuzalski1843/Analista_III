package unidad_I;

public class Encapsulamiento {
    private double saldo;

    public Encapsulamiento(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > (double)0.0F) {
            this.saldo += monto;
        }

    }

    public void retirar(double monto) {
        if (monto > (double)0.0F && monto <= this.saldo) {
            this.saldo -= monto;
        }

    }

    public double getSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        Encapsulamiento cuenta = new Encapsulamiento((double)1000.0F);
        cuenta.depositar((double)500.0F);
        cuenta.retirar((double)200.0F);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}