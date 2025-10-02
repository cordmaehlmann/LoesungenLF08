package _050_EigeneKlasse;

import _050_EigeneKlasse.Hund;

public class Main {
    //SM
    public static void main(String[] args) {

        _050_EigeneKlasse.Hund h1 = new _050_EigeneKlasse.Hund("Bello", 3);
        _050_EigeneKlasse.Hund h2 = new _050_EigeneKlasse.Hund("Luna", 5);

        System.out.println(h1);
        System.out.println(h2);

        h1.bellen();
        h2.bellen();

        System.out.println("Es wurden " + Hund.getAnzahlHunde() + " Hunde erzeugt.");
    }
}