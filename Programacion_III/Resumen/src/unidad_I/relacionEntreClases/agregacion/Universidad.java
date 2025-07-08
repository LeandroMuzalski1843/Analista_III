package unidad_I.relacionEntreClases.agregacion;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Departamento> departamentos = new ArrayList();

    public Universidad() {
    }

    public void agregarDepartamento(Departamento d) {
        this.departamentos.add(d);
    }
}