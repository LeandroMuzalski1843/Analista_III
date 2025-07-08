package unidad_III;

public class Encoltorio {
    public static void main(String[] args) {
        // Autoboxing: convertir primitivo a objeto
        int numeroPrimitivo = 10;
        Integer numeroObjeto = numeroPrimitivo;

        // Unboxing: convertir objeto a primitivo
        Double precioObjeto = 19.99;
        double precioPrimitivo = precioObjeto;

        System.out.println("Integer: " + numeroObjeto);
        System.out.println("Double: " + precioPrimitivo);
    }
}
