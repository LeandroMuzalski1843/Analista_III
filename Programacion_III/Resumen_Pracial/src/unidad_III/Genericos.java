package unidad_III;

//Clase Generica
public class Genericos<T> {
    private T contenido;

    public void guardar(T valor) {
        contenido = valor;
    }

    public T obtener() {
        return contenido;
    }

    //Uso
    public static void main(String[] args) {
        Genericos<String> cajaTexto = new Genericos<>();
        cajaTexto.guardar("Hola mundo");

        Genericos<Integer> cajaNumero = new Genericos<>();
        cajaNumero.guardar(123);

        System.out.println(cajaTexto.obtener());
        System.out.println(cajaNumero.obtener());
    }
}

