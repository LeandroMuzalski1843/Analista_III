package clases;

public class Empresa {
    private String titulo;
    private String simbolo;
    private int valuacion;

    public Empresa(String titulo, String simbolo, int valuacion){
        this.titulo = titulo;
        this.simbolo = simbolo;
        this.valuacion = valuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getValuacion() {
        return valuacion;
    }

    public void setValuacion(int valuacion) {
        this.valuacion = valuacion;
    }

    public void incrementarValuacion(int monto){
        setValuacion(this.valuacion + monto);
    }

    public void incrementarValuacion(double porcentaje){
        setValuacion((int) (this.valuacion*porcentaje)+this.valuacion);
    }

    public String calcularRango(){
        if(valuacion>=0 && valuacion <=100){
            return "Startup";
        } else if (valuacion>=101 && valuacion <=1000) {
            return "Millonaria";
        } else {
            return "Potencia";
        }
    }




}

