package unidad_III;

class Pajaro extends AbstractasInterfaces implements Volar {

    public void hacerSonido() {
        System.out.println("Pío Pío");
    }

    public void volar() {
        System.out.println("Volando alto...");
    }
}