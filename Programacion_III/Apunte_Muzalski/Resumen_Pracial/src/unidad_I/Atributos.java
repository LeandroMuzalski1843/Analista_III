package unidad_I;

//La abstracción permite ocultar los detalles internos y mostrar solo lo necesario.
public class Atributos {
    private boolean encendido;

    //public auto()
    public Atributos() {
        this.encendido = false;
    }

    public void encender(){
        encendido = true;
        System.out.println("Auto encendido");
    }

    public void conducir(){
        if (encendido) {
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
