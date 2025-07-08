package asociacion;

public class Titulo {
    private String tipo;
    private String especialidad;

    public Titulo(String tipo, String especialidad) {
        this.tipo = tipo;
        this.especialidad = especialidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return tipo + " en " + especialidad;
    }
}
