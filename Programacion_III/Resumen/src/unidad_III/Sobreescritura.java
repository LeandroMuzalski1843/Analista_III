package unidad_III;

public class Sobreescritura {
    private String titulo;
    private String autor;

    public Sobreescritura(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString() {
        return "Libro: " + this.titulo + " - Autor: " + this.autor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Sobreescritura)) {
            return false;
        } else {
            Sobreescritura otro = (Sobreescritura)obj;
            return this.titulo.equals(otro.titulo) && this.autor.equals(otro.autor);
        }
    }
}
