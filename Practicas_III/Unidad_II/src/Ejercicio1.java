public class Ejercicio1 {
        static float numero1 = 10.5f;
        static float numero2 = 5.2f;

        public static float sumar() {
            return numero1 + numero2;
        }

        public static float restar() {
            return numero1 - numero2;
        }

        public static float multiplicar() {
            return numero1 * numero2;
        }

        public static float dividir() {
            if (numero2 != 0) {
                return numero1 / numero2;
            } else {
                System.out.println("Error: División por cero.");
                return 0;
            }
        }

        public static void main(String[] args) {
            System.out.println("Suma: " + sumar());
            System.out.println("Resta: " + restar());
            System.out.println("Multiplicación: " + multiplicar());
            System.out.println("División: " + dividir());
        }
}




