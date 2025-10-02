public class Krieger {
    // Attribute (privat, gekapselt)
    private String name;
    private int lebenspunkte;
    private int staerke;

    // Statischer Zähler für die Anzahl aller Krieger
    private static int anzahlKrieger = 0;

    // Standard-Konstruktor
    public Krieger() {
        this("Unbekannt", 100, 10); // setzt Standardwerte
    }

    // Konstruktor mit nur Name
    public Krieger(String name) {
        this(name, 100, 10);
    }

    // Konstruktor mit allen Attributen
    public Krieger(String name, int lebenspunkte, int staerke) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.staerke = staerke;
        anzahlKrieger++;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    // Statische Methode zum Abrufen der Anzahl aller Krieger
    public static int getAnzahlKrieger() {
        return anzahlKrieger;
    }

    // Zusätzliche Methode: Angriff
    public void angreifen(Krieger ziel) {
        System.out.println(this.name + " greift " + ziel.getName() + " an!");
        ziel.setLebenspunkte(ziel.getLebenspunkte() - this.staerke);
        if (ziel.getLebenspunkte() <= 0) {
            System.out.println(ziel.getName() + " wurde besiegt!");
        } else {
            System.out.println(ziel.getName() + " hat noch " + ziel.getLebenspunkte() + " Lebenspunkte.");
        }
    }

    // toString-Methode
    @Override
    public String toString() {
        return "Krieger [Name=" + name +
                ", Lebenspunkte=" + lebenspunkte +
                ", Stärke=" + staerke + "]";
    }
}
