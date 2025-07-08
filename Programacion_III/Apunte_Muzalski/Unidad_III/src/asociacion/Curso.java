package asociacion;

import ejercicio2.Profesorr;

public class Curso {
    private String nombre;
    private int cupoMaximo;
    private Profesor profesor;
    private Estudiante[] estudiantes;

    public Curso(String nombre, int cupoMaximo, Profesor profesor, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}
