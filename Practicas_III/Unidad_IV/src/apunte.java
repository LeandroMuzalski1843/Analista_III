import java.util.*;

public class apunte {
    public static void main(String[] args) {

        // ================================
        //         ARRAYS UNIDIMENSIONALES
        // ================================

        // Declarar y asignar manualmente
        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;

        // Declarar e inicializar directamente
        String[] nombres = {"Ana", "Luis", "Carlos"};

        // Recorrer con for tradicional
        System.out.println("Recorrer array con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // Recorrer con for-each
        System.out.println("Recorrer array con for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // ======================
        //     CLASE Arrays
        // ======================

        // Ordenar
        Arrays.sort(nombres);
        System.out.println("Nombres ordenados: " + Arrays.toString(nombres));

        // Buscar
        int pos = Arrays.binarySearch(nombres, "Luis");
        System.out.println("Posición de Luis: " + pos);

        // Rellenar
        Arrays.fill(numeros, 7);
        System.out.println("Array rellenado: " + Arrays.toString(numeros));

        // Copiar
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Copia del array: " + Arrays.toString(copia));

        // ============================
        //     MATRICES (Arrays 2D)
        // ============================

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Recorrer matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // ============================
        //     COLLECTIONS - LIST
        // ============================

        List<String> lista = new ArrayList<>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Pez");

        // Mostrar lista
        System.out.println("Lista original: " + lista);

        // Ordenar lista
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        // Invertir
        Collections.reverse(lista);
        System.out.println("Lista invertida: " + lista);

        // ============================
        //     COLLECTIONS - SET
        // ============================

        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo"); // No se repite

        System.out.println("Set (sin duplicados): " + colores);

        // ============================
        //     COLLECTIONS - MAP
        // ============================

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");

        System.out.println("Mapa: " + mapa);
        System.out.println("Valor de clave 2: " + mapa.get(2));

        // Recorrer con for-each
        System.out.println("Recorriendo mapa:");
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // ============================
        //     CONVERSIÓN ARRAY → LISTA
        // ============================

        String[] frutas = {"Manzana", "Banana", "Naranja"};
        List<String> listaFrutas = new ArrayList<>(Arrays.asList(frutas));
        listaFrutas.add("Mango");

        System.out.println("Lista de frutas: " + listaFrutas);
    }
}
