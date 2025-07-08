package unidad_I;

public class Atributos {
    private boolean encendido = false;

    public void encender() {
        this.encendido = true;
        System.out.println("Auto encendido");
    }

    public void conducir() {
        if (this.encendido) {
            System.out.println("Conduciendo...");
        } else {
            System.out.println("Primero debes encender el auto.");
        }

    }

    public static void main(String[] args) {
        Atributos miAuto = new Atributos();
        miAuto.conducir();
        miAuto.encender();
        miAuto.conducir();
    }
}
