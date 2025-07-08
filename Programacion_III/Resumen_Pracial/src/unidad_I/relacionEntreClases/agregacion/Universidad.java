package unidad_I.relacionEntreClases.agregacion;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Departamento> departamentos = new ArrayList<>();

    public void agregarDepartamento(Departamento d) {
        departamentos.add(d);
    }
}
