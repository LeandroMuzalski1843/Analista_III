package ejercicio2;

public class Profesorr extends Persona implements Reportable{
    private String titulo;

    public Profesorr(String nombre, String dni, String titulo) {
        super(nombre, dni);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String generarReporte() {
        return "Reporte generado por: " + this.nombre;
    }
}
