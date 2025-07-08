package ejercicio4;

import java.time.LocalDate;

public class Alimento extends Producto{
    LocalDate fechaVencimiento;

    public Alimento(String nombre, double precio, Proveedor proveedor, LocalDate fechaVencimiento) {
        super(nombre, precio, proveedor);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio()*0.21 + getPrecio();
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Producto alimenticio: "+ getNombre() + " Precio: " + getPrecio() + " Proovedor: " + getProveedor().getDatosContactos() + " y vence el: " + getFechaVencimiento());
    }


}
