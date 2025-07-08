package unidad_I;
import unidad_I.herencia.Animal;
import unidad_I.herencia.Perro;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Perro();
        a1.hacerSonido();
        a2.hacerSonido();
    }
}

