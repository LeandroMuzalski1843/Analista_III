package asociacion;

public class Profesor {
    private String nombre;
    private String apellido;
    //relación 1 a 1
    private Titulo titulo;
    private int dni;

    public Profesor(String nombre, String apellido, Titulo titulo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
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

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String nommbreCompleto(){
        return this.nombre + " " + this.apellido;
    }

}
