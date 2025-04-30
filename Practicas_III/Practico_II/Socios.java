package Unidad2;

public class Socios {
    private float cuota;
    private String titular;
    private int edad;
    private boolean padresSocios;

    public Socios(String titular, int edad, boolean padresSocios, float cuota) {
        this.titular = titular;
        this.edad = edad;
        this.padresSocios = padresSocios;
        this.cuota = cuota;
        if (this.edad>=65){
            this.cuota = (float) (this.cuota-this.cuota*0.40);
        } else if (this.edad < 21) {
            if (this.padresSocios){
                this.cuota = (float) (this.cuota-this.cuota*0.45);
            }else {
                this.cuota = (float) (this.cuota-this.cuota*0.25);
            }
        }
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPadresSocios() {
        return padresSocios;
    }

    public void setPadresSocios(boolean padresSocios) {
        this.padresSocios = padresSocios;
    }


}
