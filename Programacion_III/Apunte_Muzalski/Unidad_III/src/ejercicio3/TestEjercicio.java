package ejercicio3;

public class TestEjercicio {
    public static void main(String[] args) {
        Camion camion = new Camion("Scania","S",2022,2000);
        Motocicleta motocicleta = new Motocicleta("yamaha","scooter",2015,"15");
        Electrico electrico = new Electrico("tesla","x",2022,20000);

        System.out.println("Marca del camion: "+camion.getMarca());
        System.out.println("Modelo de la moto: "+motocicleta.getModelo());
        System.out.println("Autonomia:" + electrico.getAutonomia());
        electrico.conectar();

    }
}
