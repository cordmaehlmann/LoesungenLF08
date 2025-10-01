package _010_ZweiZahlenGenauVergleichen;

import java.util.Random;

public class _010_VergleichLösungJG {
    public static void main(String[] args) {

        /*
         * Zwei Zahlen genau vergleichen
         *
         * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt.
         * Dann soll das Programm testen und ausgeben,
         * welche von den beiden Zahlen größer ist oder ob beide Zahlen gleich groß sind.
         */
        Random random = new Random();


        int a = random.nextInt(100);
        int b = random.nextInt(100);
        if(a<b){
            System.out.println(a);
        }
        else if (a>b){
            System.out.println(b);
        }
        else if (a==b){
            System.out.println("Zufälle gibts");
        }
        else {
            System.out.println(0);
        }
    }
}

