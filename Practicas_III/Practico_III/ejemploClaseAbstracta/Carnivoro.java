package ejemploClaseAbstracta;

public class Carnivoro extends Persona{
    public Carnivoro(int dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public void preferencia() {
        System.out.println("Carne");
    }
}
