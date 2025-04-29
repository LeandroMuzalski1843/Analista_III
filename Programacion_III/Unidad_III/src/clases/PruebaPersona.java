package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona pedro = new Persona("Pedro", "Gomez",35);
        System.out.println(pedro.getApellido());
        System.out.println(pedro.getNombre());
        System.out.println(pedro.getEdad());

        Persona leandro = new Persona("Leandro", "Muzalski");
        leandro.setEdad(22);
        System.out.println(leandro.inspeccionar());


    }
}
