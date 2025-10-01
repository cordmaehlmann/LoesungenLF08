package _050_EigeneKlasse;

public class SpaceMarineJG {

    // Statischer Counter
    private static int counter = 0;

    // Attribute
    private String name;
    private String rank;

    // Konstruktoren
    public SpaceMarineJG() {
        this("Alpharius", "Rookie");
    }

    public SpaceMarineJG(String name, String rank) {
        this.name = name;
        this.rank = rank;
        counter++;
    }

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }

    public static int getCounter() { return counter; }

    // toString
    @Override
    public String toString() {
        return name + " (" + rank + ")";
    }

    // Zusätzliche Methode
    public void battleCry() {
        System.out.println(name + ": Für den Imperator!");
    }
}

