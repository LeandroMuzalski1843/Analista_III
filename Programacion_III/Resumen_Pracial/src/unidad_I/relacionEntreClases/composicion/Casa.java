package unidad_I.relacionEntreClases.composicion;

public class Casa {
    private Habitacion habitacion;  // Composición

    public Casa() {
        habitacion = new Habitacion(); // creada internamente
    }
}
