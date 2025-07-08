package ejercicioColecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ProcesadorNumeros {
    private ArrayList<Integer> numeros;

    public ProcesadorNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void agregarNumeros(Integer n){
        numeros.add(n);
    }

    public void eliminarNumerosPares(){
        numeros.removeIf(n -> n % 2 == 0);
    }

    public double calcularPromedio(){
        //Si esta vacia
        if (numeros.isEmpty()) return 0;

        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return (double) suma / numeros.size();

    }

    public int encontrarMaximo(){
        if (numeros.isEmpty()) {
            throw new IllegalStateException("La lista está vacía.");
        }
        int maximo = Integer.MIN_VALUE;
        for (int n : numeros) {
            if (n > maximo) {
                maximo = n;
            }
        }
        return maximo;
    }



    public ArrayList<Integer> ordenarImpares(){
         ArrayList<Integer> impares = new ArrayList<>();
        for (int n : numeros) {
            if (n % 2 != 0) {
                impares.add(n);
            }
        }
        impares.sort(Integer::compareTo); // Orden ascendente
        return impares;
    }
}
