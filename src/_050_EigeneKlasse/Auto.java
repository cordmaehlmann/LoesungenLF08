
// HESHAM ElGEBALY

package Uebungen;

public class Auto {
    // Attribute (gekapselt)
    private String marke;
    private String farbe;
    private int baujahr;

    // Statischer Counter
    private static int anzahlAutos = 0;

    // Konstruktoren
    public Auto() {
        this("Unbekannt", "Silber", 2020);
    }

    public Auto(String marke) {
        this(marke, "Schwarz", 2021);
    }

    public Auto(String marke, String farbe, int baujahr) {
        this.marke = marke;
        this.farbe = farbe;
        this.baujahr = baujahr;
        anzahlAutos++;
    }

    // Getter & Setter
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    // Statischer Getter für Counter
    public static int getAnzahlAutos() {
        return anzahlAutos;
    }

    // Zusätzliche Methode (z. B. Auto hupen lassen)
    public void hupen() {
        System.out.println(marke + " macht: Taaaat Taaat!");
    }

    // toString-Methode
    @Override
    public String toString() {
        return "Auto: Marke=" + marke + ", Farbe=" + farbe + ", Baujahr=" + baujahr;
    }
}
