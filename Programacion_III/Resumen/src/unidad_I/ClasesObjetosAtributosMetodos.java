package unidad_I;

public class ClasesObjetosAtributosMetodos {
    private String nombre;
    private int edad;

    public ClasesObjetosAtributosMetodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años.");
    }

    public static void main(String[] args) {
        ClasesObjetosAtributosMetodos persona1 = new ClasesObjetosAtributosMetodos("Juan", 30);
        persona1.saludar();
    }
}