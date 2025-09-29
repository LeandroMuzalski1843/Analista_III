package PruebaArreglo;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class DiferenciaDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateFormat miDF = DateFormat.getDateInstance(DateFormat.SHORT);
        Date fecha1 = new Date();
        Date fecha2 = new Date();
        String fechaString1, fechaString2;
        System.out.println("Introduzca fecha en formato (dd/mm/yy)");
        fechaString1 = scan.nextLine();
        System.out.println("Introduzca fecha en formato (dd/mm/yy)");
        fechaString2 = scan.nextLine();
        try{
            fecha1 = miDF.parse(fechaString1);
            fecha2 = miDF.parse(fechaString2);
        }catch(ParseException e){
            System.out.println("Formato incorrecto de fecha");
        }
        long msDiferencia= fecha2.getTime() - fecha1.getTime();
        long msDia = 24 * 60 * 60 * 1000;
        int numDias = (int) (msDiferencia/msDia);
        System.out.println("Hay una diferencia de " + numDias + " dias");
    }
}
