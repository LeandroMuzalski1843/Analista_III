package unidad_IV;
import java.io.*;
public class JerarquiaExcepciones {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea = br.readLine();
            System.out.println("Contenido: " + linea);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}

/*
Throwable
 ├─ Error (no se maneja)
 └─ Exception
     ├─ IOException
     └─ RuntimeException
         ├─ NullPointerException
         ├─ ArithmeticException
         └─ ArrayIndexOutOfBoundsException

*/
