package unidad_I.herencia;

public class Animal {
    public Animal() {
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();
    }
}
