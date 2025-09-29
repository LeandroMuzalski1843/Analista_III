import java.util.Random;

public class CuentaBancaria {
    private String numeroDeCuenta;
    private String nombreTitular;
    private double saldoActualCuenta;

    public CuentaBancaria(String nombreTitular, double saldoActualCuenta) {
        this.numeroDeCuenta = numeroCuenta();
        this.nombreTitular = nombreTitular;
        this.saldoActualCuenta = saldoActualCuenta;
    }

    public CuentaBancaria(String nombreTitular) {
        this.numeroDeCuenta = numeroCuenta();
        this.nombreTitular = nombreTitular;
        this.saldoActualCuenta = 0.00;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldoActualCuenta() {
        return saldoActualCuenta;
    }

    public void setSaldoActualCuenta(double saldoActualCuenta) {
        this.saldoActualCuenta = saldoActualCuenta;
    }

    public String numeroCuenta(){
        Random rand = new Random();
        String numeros = "0123456789";
        char[] pass = new char[10];

        for (int i = 0; i < pass.length; i++) {
            int aleatorio = rand.nextInt(numeros.length());
            pass[i] = numeros.charAt(aleatorio);
        }
        return new String(pass);
    }

    public boolean depositar(double monto){
        if(monto>0){
            saldoActualCuenta += monto;
            System.out.println("Deposito Exitoso");
        } else {
            System.out.println("El monto tiene que ser positivo y distinto de 0");
            return false;
        }
        return true;
    }

    public void retirar(double monto){
        if (monto>0){
            if(saldoActualCuenta>=0){
                if(saldoActualCuenta>monto){
                    saldoActualCuenta -= monto;
                } else {
                    System.out.println("El monto es mayor al saldo disponible");
                }
            } else {
                System.out.println("no tiene dinero para retirar");
            }
        } else {
            System.out.println("El monto tiene que ser positivo y distinto de 0");
        }
    }

    public String esActiva(){
        if (saldoActualCuenta>0){
            if(nombreTitular.length()>0 && nombreTitular != null) {
                return "Cuenta Activa";
            }
        }
        return "Cuenta no activa";
    }
}
