package ejercicio;

public class TarjetaCredito extends TarjetaBancaria implements Proveedor{
    private int montoMantenimiento;
    private String proveedor;

    public TarjetaCredito(int numero, int cvu, String fechaVencimiento, String titular, int montoMantenimiento, String proveedor) {
        super(numero, cvu, fechaVencimiento, titular);
        this.montoMantenimiento = montoMantenimiento;
        this.proveedor = proveedor;
    }

    public int getMontoMantenimiento() {
        return montoMantenimiento;
    }

    public void setMontoMantenimiento(int montoMantenimiento) {
        this.montoMantenimiento = montoMantenimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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
