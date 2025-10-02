package _050_EigeneKlasse._050_Sascha;

public class Main {
    //SM
    public static void main(String[] args) {

        Hund h1 = new Hund("Bello", 3);
        Hund h2 = new Hund("Luna", 5);

        System.out.println(h1);
        System.out.println(h2);

        h1.bellen();
        h2.bellen();

        System.out.println("Es wurden " + Hund.getAnzahlHunde() + " Hunde erzeugt.");
    }
}