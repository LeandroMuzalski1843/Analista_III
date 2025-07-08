package unidad_III;

public class Sobrescritura {
    private String titulo;
    private String autor;

    public Sobrescritura(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " - Autor: " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sobrescritura)) return false;

        Sobrescritura otro = (Sobrescritura) obj;
        return this.titulo.equals(otro.titulo) && this.autor.equals(otro.autor);
    }
}
