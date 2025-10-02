
// HESHAM ElGEBALY
package Uebungen;

public class Main_Auto {
    public static void main(String[] args) {
        Auto a1 = new Auto("Mercedes");
        Auto a2 = new Auto("BMW");
        Auto a3 = new Auto("Mazda", "Grau", 2018);

        System.out.println(a1); // toString() wird automatisch aufgerufen
        System.out.println(a2);
        System.out.println(a3);

        a2.hupen(); // Zusätzliche Methode testen

        System.out.println("Anzahl erzeugter Autos: " + Auto.getAnzahlAutos());
    }
}

