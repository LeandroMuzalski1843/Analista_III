package unidad_II;

public class Arreglos {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3};

        for(int num : numeros) {
            System.out.println("Número: " + num);
        }

        int[][] matriz = new int[][]{{1, 2}, {3, 4}};

        for(int i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                System.out.println("Elemento [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

    }
}