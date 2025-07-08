package ejercicio2;

public class Estudiante extends Persona implements Reportable{
    private String legajo;

    public Estudiante(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String generarReporte() {
        return "reporte generado por: "+this.nombre;
    }
}
