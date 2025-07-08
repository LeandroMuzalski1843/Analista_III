package unidad_III;


public class AtributosYMetodos {
    private int numeroInstancia;
    private static int totalObjetos = 0;

    public AtributosYMetodos() {
        this.numeroInstancia = ++totalObjetos;
    }

    public int getNumeroInstancia() {
        return this.numeroInstancia;
    }

    public static int getTotalObjetos() {
        return totalObjetos;
    }
}

