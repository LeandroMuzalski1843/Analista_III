package unidad_I.relacionEntreClases.asociacion;

public class Curso {
    private Profesor profesor;

    public Curso(Profesor profesor) {
        this.profesor = profesor;
    }

    public void iniciarCurso() {
        this.profesor.dictarClase();
    }
}
