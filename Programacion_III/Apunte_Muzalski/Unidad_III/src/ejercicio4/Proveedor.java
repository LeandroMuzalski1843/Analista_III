package ejercicio4;

public class Proveedor {
    private String nombre;
    private String cuit;

    public Proveedor(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDatosContactos(){
        return  getNombre() + ", CUIT: " + getCuit();
    }
}
