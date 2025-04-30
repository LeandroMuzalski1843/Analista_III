package Unidad2;
import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class mesAnio {
    private int num;
    private Scanner input;
    public mesAnio() {
        this.input = new Scanner(System.in);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void validadorMes(){
        try {
            System.out.println("Ingrese el numero del mes");
            this.num = input.nextInt();
            if (this.num >= 1 && this.num <= 12) {
                System.out.println(Month.of(this.num).getDisplayName(java.time.format.TextStyle.FULL, Locale.forLanguageTag("es-ES")));
            } else {
                System.out.println("No es un numero valido");
            }
        }catch (InputMismatchException e){
            System.out.println("Tipo de dato invalido");
        }
    }
}
