package herencia;

public class PruebaFiguras {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo("Rojo", true,10,5);

        System.out.println(r1.isRellenado());

        Circulo c1 = new Circulo(2,"azul");
        System.out.println("cantidad de circulos: "+ Circulo.getCantidadObjetos());
        Circulo c2 = new Circulo(4,"amarillo");
        System.out.println("cantidad de circulos: "+ Circulo.getCantidadObjetos());
        System.out.println(c1.isRellenado());
        System.out.println(c1.calcularArea());

    }
}
