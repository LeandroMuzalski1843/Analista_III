package ejemploClaseAbtracta;

public class Vegetariano extends Persona{
    public Vegetariano(int dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public void preferencia() {
        System.out.println("Verdura");
    }

}
