public class Main {
    public static void main(String[] args) {
        // Krieger erzeugen
        Krieger k1 = new Krieger("Thor", 120, 15);
        Krieger k2 = new Krieger("Loki");

        // Ausgabe
        System.out.println(k1);
        System.out.println(k2);

        // Kampf
        k1.angreifen(k2);
        k2.angreifen(k1);

        // Anzahl aller Krieger anzeigen
        System.out.println("Es gibt insgesamt " + Krieger.getAnzahlKrieger() + " Krieger.");
    }
}
