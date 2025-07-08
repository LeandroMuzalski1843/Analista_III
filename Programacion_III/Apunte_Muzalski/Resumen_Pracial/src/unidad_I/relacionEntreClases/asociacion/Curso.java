package unidad_I.relacionEntreClases.asociacion;

public class Curso {
    private Profesor profesor;  // Asociación

    public Curso(Profesor profesor) {
        this.profesor = profesor;
    }

    public void iniciarCurso() {
        profesor.dictarClase();
    }
}
