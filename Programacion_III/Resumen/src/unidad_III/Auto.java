package unidad_III;

class Auto extends ThisYSuper {
    private String modelo;

    public Auto(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + super.marca + " | Modelo: " + this.modelo);
    }
}

