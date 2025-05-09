package ejercicio2;

public class Administrativo extends Persona{
    private String sector;

    public Administrativo(String nombre, String dni, String sector) {
        super(nombre, dni);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
