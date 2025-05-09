package herencia;

//Clase final es una clase que no puede ser heredada
public final class Perro extends Animal{
    private String raza;
    private int edad;

    public Perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String sonido() {
        return "Guau";
    }
}
