package Unidad2;
import java.lang.reflect.Type;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    private Scanner input;
    private float x;
    private float y;

    public Calculadora(float x, float y) {
        this.input = new Scanner(System.in);
        this.x = x;
        this.y = y;
    }

    public Calculadora(){
        this.input = new Scanner(System.in);
        this.x = 1;
        this.y = 3;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void calculos(){
        System.out.printf("Suma: %.2f, Resta: %.2f, Multiplicacion: %.2f, Division: %.2f",this.x+this.y,this.x-this.y,this.x*this.y,this.x/this.y);
    }
    private void setterXY(){
        System.out.println("Ingrese los valores a calcular");
        System.out.print("Numero 1:");
        setX(input.nextFloat());
        System.out.print("Numero 2:");
        setY(input.nextFloat());
    }
    public void calculosInputUsuario(){
        System.out.println("Ingrese los dos numeros para realizar los calculos");
        System.out.print("Numero 1:");
        setX(input.nextFloat());
        System.out.print("Numero 2:");
        setY(input.nextFloat());
        System.out.printf("Suma: %.2f, Resta: %.2f, Multiplicacion: %.2f, Division: %.2f",this.x+this.y,this.x-this.y,this.x*this.y,this.x/this.y);
    }

    public void calculoSwitch() {
        int operacion = 5;
        while (operacion != 99) {
                System.out.println("\nIngrese la opcion que desea realizar: 1)Suma,2)Resta,3)Multiplicacion,4)Division, 99)Salir: ");
            try {
                operacion = input.nextInt();
                switch (operacion) {
                    case 1: {
                        setterXY();
                        System.out.printf("Suma: %.2f", this.x + this.y);
                        break;
                    }
                    case 2: {
                        setterXY();
                        System.out.printf("Resta: %.2f", this.x - this.y);
                        break;
                    }
                    case 3: {
                        setterXY();
                        System.out.printf("Multiplicacion: %.2f", this.x * this.y);
                        break;
                    }
                    case 4: {
                        setterXY();
                        while (this.y == 0) {
                            System.out.println("No se puede dividir por 0, ingrese otro dato");
                            setY(input.nextFloat());
                        }
                        System.out.printf("Division: %.2f", this.x / this.y);
                        break;
                    }
                    default: {
                        System.out.println("Valor ingresado invalido, aprete ENTER o vuelva a ingresar '99' para salir");
                        operacion = input.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato incorrecto");
            }
        }
    }
}
