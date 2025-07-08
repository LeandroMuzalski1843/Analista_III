package unidad_III;

public class ThisYSuper {
    protected String marca;

    public ThisYSuper(String marca) {
        this.marca = marca;
    }
}
class Auto extends ThisYSuper {
    private String modelo;

    public Auto(String marca, String modelo) {
        super(marca); // llama al constructor de Vehiculo
        this.modelo = modelo; // referencia al atributo del objeto actual
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + super.marca + " | Modelo: " + this.modelo);
    }
}