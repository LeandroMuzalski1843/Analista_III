package unidad_I;
import unidad_I.heremcia.*;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Perro();  // Polimorfismo

        a1.hacerSonido(); // Salida: El animal hace un sonido.
        a2.hacerSonido(); // Salida: El perro ladra.
    }
}
