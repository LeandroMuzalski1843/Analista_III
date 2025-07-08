package unidad_III;

public class Genericos<T> {
    private T contenido;

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return this.contenido;
    }

    public static void main(String[] args) {
        Genericos<String> cajaTexto = new Genericos<String>();
        cajaTexto.guardar("Hola mundo");
        Genericos<Integer> cajaNumero = new Genericos<Integer>();
        cajaNumero.guardar(123);
        System.out.println(cajaTexto.obtener());
        System.out.println(cajaNumero.obtener());
    }
}
