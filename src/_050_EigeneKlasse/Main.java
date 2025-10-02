package Übungen;

public class Main {
    //Made by David Brauch
        public static void main(String[] args) {
            Car car1 = new Car();
            Car car2 = new Car("BMW", 50);

            System.out.println(car1);
            System.out.println(car2);

            car2.accelerate();
            car2.accelerate();

            System.out.println("Nach dem Beschleunigen: " + car2);
            System.out.println("Anzahl erzeugter Autos: " + Car.getCounter());
        }
    }

