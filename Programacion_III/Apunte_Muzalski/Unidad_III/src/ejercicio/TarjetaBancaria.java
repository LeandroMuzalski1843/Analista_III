package ejercicio;

public class TarjetaBancaria {
    private int numero;
    private int cvu;
    private String fechaVencimiento;
    private String titular;

    public TarjetaBancaria(int numero, int cvu, String fechaVencimiento, String titular) {
        this.numero = numero;
        this.cvu = cvu;
        this.fechaVencimiento = fechaVencimiento;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvu() {
        return cvu;
    }

    public void setCvu(int cvu) {
        this.cvu = cvu;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
