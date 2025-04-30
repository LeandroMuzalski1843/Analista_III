package Unidad2;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cadena {
    private String texto1;
    private String texto2;
    private char caracter1;
    private char caracter2;
    private Scanner input;

    public Cadena(String texto1, String texto2) {
        this.input = new Scanner(System.in);
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    public Cadena(char caracter1, String texto1, char caracter2) {
        this.input = new Scanner(System.in);
        this.caracter1 = caracter1;
        this.texto1 = texto1;
        this.caracter2 = caracter2;
    }

    public Cadena(String texto1) {
        this.input = new Scanner(System.in);
        this.texto1 = texto1;
    }

    public Cadena() {
        this.texto1 = "Cadena de ejemplo";
        this.texto2 = "cadena distinta";
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public char getCaracter1() {
        return caracter1;
    }

    public void setCaracter1(char caracter1) {
        this.caracter1 = caracter1;
    }

    public char getCaracter2() {
        return caracter2;
    }

    public void setCaracter2(char caracter2) {
        this.caracter2 = caracter2;
    }

    public void cantidadVocales() {
        int cantVocales = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < this.texto1.length(); i++) {
            char c = this.texto1.charAt(i);
            if (vocales.indexOf(c) != -1) {
                cantVocales++;
            }
        }
        System.out.printf("La cantidad de vocales del string es de %d",cantVocales);
    }
    public void cadenaMayusculaLongitud(){
        System.out.printf("Texto antes: %s\n",this.texto1);
        this.texto1 = this.texto1.toUpperCase();
        System.out.printf("Texto despues: %s\n",this.texto1);
        System.out.printf("Longitud del texto: %d\n",this.texto1.length());
    }
    public void reemplazadorCaracteres(){
        String textoPivote;
        try{
            System.out.println("Ingrese dos caracteres");
            System.out.println("Caracter 1:");
            textoPivote = input.nextLine();
            this.caracter1 = textoPivote.charAt(0);
            System.out.println("Caracter 2:");
            textoPivote = input.nextLine();
            this.caracter2 = textoPivote.charAt(0);
            System.out.printf("La cadena es: %s, la cadena reemplazada es: %s",this.texto1,
                    this.texto1.replace(this.caracter1,this.caracter2));
        }catch (InputMismatchException e){
            System.out.println("Tipo de dato erroneo o invalido");
        }
    }
    public void sonIguales(){
        if (this.texto1.equalsIgnoreCase(this.texto2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas son distintas");
        }
    }
}
