package clases;

public class Persona {
    //1) Atributos
    // visibilidad tipo nombre
    private String nombre;
    private String apellido;
    private int edad;


    //2) Metodos
    //2.1) Constructores
    public Persona(String nombre, String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //El metodo Persona() esta "sobrecargado": esta definido mas de una vez en la clase pero difieren la cantidad y tipo de argumento
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 18;
    }

    public Persona(){}

    //2.2) Getters y Setters
    //Getter es el metodo que devuelve el valor de un atributo
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //alt+insert crea el resto de las clases


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //3) Metodos heredados (Objetos o clases padres)

    //4) Metodos propios o personalizados de la clase
    public String inspeccionar(){
        return "La persona "+nombre+" "+apellido+" tiene "+edad+" años.";
    }

    public String esMayorEdad(){
        if(edad >= 18){
            return this.apellido + " es mayor de edad";
        } else {
            return this.apellido + " es menor de edad";
        }
    }




}
