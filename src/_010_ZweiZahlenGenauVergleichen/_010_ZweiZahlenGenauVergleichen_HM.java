package _010_ZweiZahlenGenauVergleichen;

import java.util.Random;


public class _010_ZweiZahlenGenauVergleichen_HM {

    public static void main(String[] args) {
        Random rand = new Random();

        int zahl1 = rand.nextInt(101);
        int zahl2 = rand.nextInt(101);
        System.out.println("Zahl 1: " + zahl1);
        System.out.println("Zahl 2: " + zahl2);

        if (zahl1 > zahl2) {
            System.out.println("Zahl 1 ist größer als Zahl 2.");
        } else if (zahl2 > zahl1) {
                System.out.println("Zahl 2 ist größer als Zahl 1.");
        } else {
                    System.out.println("Beide Zahlen sind gleich groß.");

            }
        }


}