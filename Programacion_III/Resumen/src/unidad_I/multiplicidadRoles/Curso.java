package unidad_I.multiplicidadRoles;


import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiantes> estudiantes = new ArrayList();

    public Curso() {
    }

    public void agregarEstudiante(Estudiantes e) {
        this.estudiantes.add(e);
    }
}
