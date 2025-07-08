package ejerciciosMapa.ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaUniversidad {
    public static void main(String[] args) {
        Map<String, Map<String, Double>> registro = new HashMap<>();
        Scanner ingreso = new Scanner(System.in);
        int opc;

        // Estudiantes pre-cargados
        Map<String, Double> notas1 = new HashMap<>();
        notas1.put("Matemática", 8.0);
        notas1.put("Historia", 7.5);
        registro.put("A001", notas1);

        Map<String, Double> notas2 = new HashMap<>();
        notas2.put("Literatura", 9.0);
        notas2.put("Física", 6.5);
        registro.put("A002", notas2);

        Map<String, Double> notas3 = new HashMap<>();
        notas3.put("Biología", 8.5);
        registro.put("A003", notas3);

        Map<String, Double> notas4 = new HashMap<>();
        notas4.put("Química", 7.0);
        notas4.put("Matemática", 8.2);
        registro.put("A004", notas4);

        Map<String, Double> notas5 = new HashMap<>();
        notas5.put("Historia", 9.5);
        registro.put("A005", notas5);

        do {
            System.out.println("\n--- Sistema de Registro Universitario ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Agregar calificación");
            System.out.println("3. Mostrar calificaciones de un estudiante");
            System.out.println("4. Mostrar todos los estudiantes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = ingreso.nextInt();
            ingreso.nextLine(); // limpiar el buffer

            switch (opc) {
                case 1:
                    System.out.print("Ingrese número de matrícula: ");
                    String matricula = ingreso.nextLine();

                    if (!registro.containsKey(matricula)) {
                        registro.put(matricula, new HashMap<>());
                        System.out.println("Estudiante registrado");
                    } else {
                        System.out.println("La matrícula ya está registrada");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese número de matrícula: ");
                    matricula = ingreso.nextLine();

                    if (registro.containsKey(matricula)) {
                        System.out.print("Ingrese nombre de la materia: ");
                        String materia = ingreso.nextLine();

                        System.out.print("Ingrese calificación: ");
                        double nota = ingreso.nextDouble();
                        ingreso.nextLine(); // limpiar buffer

                        registro.get(matricula).put(materia, nota);
                        System.out.println("Calificación registrada");
                    } else {
                        System.out.println("Matrícula no encontrada");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese número de matrícula: ");
                    matricula = ingreso.nextLine();

                    if (registro.containsKey(matricula)) {
                        System.out.println("Calificaciones de " + matricula + ":");
                        Map<String, Double> calificaciones = registro.get(matricula);

                        if (calificaciones.isEmpty()) {
                            System.out.println("Sin calificaciones registradas.");
                        } else {
                            for (Map.Entry<String, Double> entry : calificaciones.entrySet()) {
                                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
                            }
                        }
                    } else {
                        System.out.println("Matrícula no encontrada.");
                    }
                    break;

                case 4:
                    if (registro.isEmpty()) {
                        System.out.println("No hay estudiantes registrados");
                    } else {
                        System.out.println("Estudiantes registrados:");
                        for (String mat : registro.keySet()) {
                            System.out.println("- " + mat);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa....");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opc != 0);

        ingreso.close();
    }
}
