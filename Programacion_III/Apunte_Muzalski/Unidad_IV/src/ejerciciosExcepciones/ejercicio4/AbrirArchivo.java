package ejerciciosExcepciones.ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AbrirArchivo {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        try {
            System.out.println("Ingrese el nombre del archivo (sin extension)");
            String nombreArchivo = ingreso.nextLine().trim();

            if (nombreArchivo.isEmpty()){
                throw new IllegalArgumentException("Error, el nombre no puede estar vacio");
            }


            String nombreCompleto = nombreArchivo + ".txt";
            File archivo = new File(nombreCompleto);


            Scanner leerArchivo = new Scanner(archivo);
            System.out.println("Contenido del Archivo: " + nombreCompleto + ": ");
            while (leerArchivo.hasNextLine()){
                String linea = leerArchivo.nextLine();
                System.out.println(linea);
            }

            leerArchivo.close();

        }catch (FileNotFoundException e){
            System.out.println("Error, el archivo no fue encontrado");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        ingreso.close();
    }
}
