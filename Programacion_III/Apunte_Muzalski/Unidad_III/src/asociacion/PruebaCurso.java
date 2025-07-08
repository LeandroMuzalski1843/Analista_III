package asociacion;

public class PruebaCurso {
    public static void main(String[] args) {
        asociacion.Estudiante leo = new asociacion.Estudiante("leo","muzalski",5654,44772668);
        asociacion.Estudiante pedro = new asociacion.Estudiante("pedro","muchale",5754,45572668);
        asociacion.Estudiante luis = new asociacion.Estudiante("luis","muchale",5758,45574468);

        asociacion.Estudiante[] estudiantes = {leo,pedro,luis};

        Titulo ingeniero = new Titulo("Ingenieria","Computación");

        Profesor carolina = new Profesor("Carolina","Cosgaya",ingeniero,30122122);

        Curso programacionJava = new Curso("Programacion en Java",20, carolina ,estudiantes);

        System.out.println("El curso es: " + programacionJava.getNombre());
        System.out.println("El Profesor que dicta el curso se llama: " + programacionJava.getProfesor().nommbreCompleto() + " y su titulo es de: " + programacionJava.getProfesor().getTitulo());



    }
}
