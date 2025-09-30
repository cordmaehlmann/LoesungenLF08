import java.util.Random;

public class _010_SW {

    public static void main(String[] args) {

        Random r = new Random();

        int wurf = r.nextInt(1, 10);
        System.out.println("Zahl 1: " + wurf);

        int wurf2 = r.nextInt(1, 10);
        System.out.println("Zahl 2: " + wurf2);  // z.B. 3

        if (wurf > wurf2) {
            System.out.println("Zahl 1 ist größer als Zahl 2.");
        } else if (wurf < wurf2) {
            System.out.println("Zahl 2 ist größer als Zahl 1.");
        } else {
            System.out.println("Beide Zahlen sind gleich groß.");

        }
    }
}
