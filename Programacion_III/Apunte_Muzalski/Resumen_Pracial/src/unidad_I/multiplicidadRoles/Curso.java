package unidad_I.multiplicidadRoles;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiantes> estudiantes; // 1 a muchos (1 Curso tiene muchos Estudiantes)

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiantes e) {
        estudiantes.add(e);
    }
}
