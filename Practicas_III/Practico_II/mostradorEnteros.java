package Unidad2;

import javax.naming.NameNotFoundException;
import java.lang.classfile.constantpool.NameAndTypeEntry;
import java.util.InputMismatchException;
import java.util.Scanner;
public class mostradorEnteros {
    private int num1;
    private int num2;
    private Scanner input;

    public mostradorEnteros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.input = new Scanner(System.in);
    }

    public mostradorEnteros(){
        this.input = new Scanner(System.in);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void cargarNumeros() {
        while (true) {
            try {
                System.out.println("Ingrese los datos");
                System.out.println("Numero 1:");
                setNum1(input.nextInt());
                System.out.println("Numero 2:");
                setNum2(input.nextInt());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato incorrecto");
                input.nextLine();
            }
        }
    }

    public void enteros(){
        cargarNumeros();
        for (int i = this.num1; i <=this.num2 ; i++) {
            System.out.printf("Numero: %d, faltan %s \n", i,this.num2-i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
