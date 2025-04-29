public class Cadenas {
    public static void main(String[] args) {
        String mensaje = "Esta es una cadena";


        // --- Operaciones básicas con cadenas ---
        System.out.println("Longitud del mensaje: " + mensaje.length());            // Cantidad de caracteres
        System.out.println("Mensaje en minúsculas: " + mensaje.toLowerCase());       // Convertir a minúsculas
        System.out.println("Mensaje en mayúsculas: " + mensaje.toUpperCase());       // Convertir a mayúsculas
        System.out.println("Mensaje sin espacios al inicio/fin: " + mensaje.trim()); // Eliminar espacios sobrantes
        System.out.println("Primer carácter del mensaje: " + mensaje.charAt(0));      // Acceder a un carácter específico

        // --- Comparación de cadenas ---
        String mismaCadena = "Esta es una cadena";

        System.out.println("\n¿Son exactamente iguales?: " + mensaje.equals(mismaCadena)); // Comparación exacta
        System.out.println("¿Son iguales ignorando mayúsculas/minúsculas?: " + mensaje.equalsIgnoreCase("ESTA cadena")); // Comparación ignorando mayúsculas

        System.out.println("\n¿El mensaje empieza con 'ES'?: " + mensaje.startsWith("ES"));    // Verificar prefijo (sensible a mayúsculas)
        System.out.println("¿El mensaje termina con 'mensaje'?: " + mensaje.endsWith("mensaje")); // Verificar sufijo

        System.out.println("\nComparación léxica con otra cadena (compareTo): " + mensaje.compareTo("Esta es una cadena"));
        // Resultado de compareTo:
        // 0 -> si son iguales
        // negativo -> si mensaje es "menor"
        // positivo -> si mensaje es "mayor"

        System.out.println("¿El mensaje contiene la letra 'E'?: " + mensaje.contains("E")); // Verificar si contiene un fragmento

        // --- Conversión entre tipos ---
        String cadenaLetra = "A";   // Cadena que contiene un solo carácter
        char letra = 'A';           // Carácter

        // Mostrar ambos
        System.out.println("\nCadena de un solo carácter: " + cadenaLetra);
        System.out.println("Carácter individual: " + letra);



    }
}
