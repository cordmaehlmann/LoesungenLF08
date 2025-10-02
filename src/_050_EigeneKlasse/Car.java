package _050_EigeneKlasse;

public class Car {
    //Made by David Brauch
        // Attribute
        private String brand;
        private int speed;

        // Statischer Counter
        private static int counter = 0;

        // Konstruktoren
        public Car() {
            this("Unbekannt", 0); // ruft den zweiten Konstruktor auf
        }

        public Car(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
            counter++;
        }

        // Getter & Setter
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        // Zusatzmethode
        public void accelerate() {
            this.speed += 10;
            System.out.println(this.brand + " beschleunigt auf " + this.speed + " km/h.");
        }

        // Statische Methode
        public static int getCounter() {
            return counter;
        }

        // toString()
        @Override
        public String toString() {
            return "Car{Marke='" + brand + "', Geschwindigkeit=" + speed + " km/h}";
        }
    }

