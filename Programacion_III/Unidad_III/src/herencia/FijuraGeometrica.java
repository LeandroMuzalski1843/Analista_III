package herencia;

public class FijuraGeometrica {
    private String color;
    private boolean rellenado;

    public FijuraGeometrica(String color, boolean rellenado) {
        this.color = color;
        this.rellenado = rellenado;
    }

    public FijuraGeometrica(String color) {
        this.color = color;
        this.rellenado = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellenado() {
        return rellenado;
    }

    public void setRellenado(boolean rellenado) {
        this.rellenado = rellenado;
    }

    /* Conversion del objeto a cadena que yo necesito
    @Override
    public String toString() {
        return "El color de mi figura es: " + this.getColor();
    }
    */

    //con alt+ins
    @Override
    public String toString() {
        return "FijuraGeometrica{" +
                "color='" + color + '\'' +
                ", rellenado=" + rellenado +
                '}';
    }
}
