package unidad_I;

// Clase Persona con atributos y métodos
public class ClasesObjetosAtributosMetodos {
    //Atributos
    private String nombre;
    private int edad;

    //Constructor
    public ClasesObjetosAtributosMetodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    //Clase de prueba
    public static void main(String[] args) {
        ClasesObjetosAtributosMetodos persona1 = new ClasesObjetosAtributosMetodos("Juan", 30);
        persona1.saludar();
    }

}
