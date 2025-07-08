package ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Obrero obrero1 = new Obrero("leo","44772668",2,5000);
        Obrero obrero2 = new Obrero("Pablo","22665789",1,1500);
        Profesorr profe = new Profesorr("Pepe","44444444","tecnico");
        Estudiante alumno = new Estudiante("leo","44772668","6545");

        System.out.println(obrero1.calcularFacturaTotal());
        System.out.println("-------------");
        System.out.println(obrero2.calcularFacturaTotal());
        System.out.println("-------------");
        System.out.println(profe.generarReporte());
        System.out.println("-------------");
        System.out.println(alumno.generarReporte());
    }
}
