package unidad_III;

abstract class AbstractasInterfaces {
    public abstract void hacerSonido();  // método abstracto
    public void respirar() {
        System.out.println("Respirando...");
    }
}

// Interfaz
interface Volador {
    void volar();
}

// Subclase concreta
class Pajaro extends AbstractasInterfaces implements Volador {
    public void hacerSonido() {
        System.out.println("Pío Pío");
    }

    public void volar() {
        System.out.println("Volando alto...");
    }
}
