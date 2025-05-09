package ejercicio4;

import java.time.LocalDate;

public class TestEjercicio4 {
    public static void main(String[] args) {
        Alimento verdura = new Alimento("lechuga",23.1,new Proveedor("Cacho","123113a"), LocalDate.now());
        verdura.mostrarDetalle();
    }
}



