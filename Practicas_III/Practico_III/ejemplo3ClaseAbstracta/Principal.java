package ejemplo3ClaseAbstracta;

public class Principal {
    public static void hacerCantar(Cantante c){
        c.cantar();
    }

    public static void main(String[] args) {
        Canario pajaro = new Canario();
        Persona julian = new Persona();

        hacerCantar(pajaro);
        hacerCantar(julian);
    }
}
