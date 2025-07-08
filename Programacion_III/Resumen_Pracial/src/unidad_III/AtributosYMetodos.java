package unidad_III;

public class AtributosYMetodos {
    private int numeroInstancia;              // atributo de instancia
    private static int totalObjetos = 0;      // atributo de clase

    public AtributosYMetodos() {
        numeroInstancia = ++totalObjetos;
    }

    public int getNumeroInstancia() {
        return numeroInstancia;
    }

    public static int getTotalObjetos() {     // método de clase
        return totalObjetos;
    }
}
