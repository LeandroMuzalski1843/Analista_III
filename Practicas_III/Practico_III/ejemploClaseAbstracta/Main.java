package ejemploClaseAbstracta;

public class Main {
    public static void main(String[] args) {
        Carnivoro julian  = new Carnivoro(231231,"Julian");
        Vegetariano pepe = new Vegetariano(11111,"pepe");
        julian.getNombre();
        julian.preferencia();
        System.out.println("Pepe");
        pepe.preferencia();
    }
}
