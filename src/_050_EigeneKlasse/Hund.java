package _050_EigeneKlasse;

public class Hund {
//SM
    // Attribute
    private String name;
    private int alter;

    // Statischer Counter
    private static int anzahlHunde = 0;

    // Konstruktoren
    public Hund() {
        this("Unbekannt", 0);
    }

    public Hund(String name, int alter) {
        this.name = name;
        this.alter = alter;
        anzahlHunde++;
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAlter() { return alter; }
    public void setAlter(int alter) { this.alter = alter; }

    public static int getAnzahlHunde() { return anzahlHunde; }

    // toString
    @Override
    public String toString() {
        return "Hund: " + name + ", Alter: " + alter;
    }

    // Zusätzliche Methode
    public void bellen() {
        System.out.println(name + " bellt: Wuff Wuff!");
    }
}