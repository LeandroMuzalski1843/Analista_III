package asociacion;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int matricula;
    private int dni;

    public Estudiante(String nombre, String apellido, int matricula, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
