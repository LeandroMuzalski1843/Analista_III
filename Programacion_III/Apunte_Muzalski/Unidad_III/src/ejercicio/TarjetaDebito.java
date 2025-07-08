package ejercicio;

public class TarjetaDebito extends TarjetaBancaria implements Proveedor{
    private int limiteDiario;
    private String proveedor;

    public TarjetaDebito(int numero, int cvu, String fechaVencimiento, String titular, int limiteDiario, String proveedor) {
        super(numero, cvu, fechaVencimiento, titular);
        this.limiteDiario = limiteDiario;
        this.proveedor = proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(int limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    @Override
    public String mostrarCategoria() {
        if(this.proveedor.equals("VISA")){
            return "Platino";
        } else if (this.proveedor.equals("Mastercard")) {
            return "Estandar";
        } else if (this.proveedor.equals("Otros")){
            return "Común";
        } else {
            return "Opción invalida";
        }
    }
}
