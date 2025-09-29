import java.util.ArrayList;

public class Ejercicio1 {
    static int getValor(int indice, ArrayList<Integer> lista)throws IndexOutOfBoundsException {
        try {
            System.out.println("Elemento: " + lista.get(indice));
            return lista.get(indice);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Excepcion: Indice de array fuera de limites");
        }
        return indice;
    }
    public static void main(String[] args) {
        ArrayList<Integer> listota = new ArrayList<>();
        listota.add(2);
        listota.add(24);
        listota.add(25);
        listota.add(28);
        listota.add(81);
        getValor(9, listota);
    }
}
