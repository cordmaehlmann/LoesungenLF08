package Übungen;

import java.util.Random;
public class _010_ZweiZahlenGenauVergleichen {

    public static void main(String[] args) {

        /*
         * Zwei Zahlen genau vergleichen
         *
         * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt.
         * Dann soll das Programm testen und ausgeben,
         * welche von den beiden Zahlen größer ist oder ob beide Zahlen gleich groß sind.
         */

        Random rand = new Random();

        // zwei Zufallszahlen zwischen 0 und 100
        int zahl1 = rand.nextInt(101);
        int zahl2 = rand.nextInt(101);

        System.out.println("Zahl 1: " + zahl1);
        System.out.println("Zahl 2: " + zahl2);

        // Vergleich
        if (zahl1 > zahl2) {
            System.out.println("Zahl 1 ist größer als Zahl 2.");
        } else if (zahl2 > zahl1) {
            System.out.println("Zahl 2 ist größer als Zahl 1.");
        } else {
            System.out.println("Beide Zahlen sind gleich groß.");
        }




        







    }
}


