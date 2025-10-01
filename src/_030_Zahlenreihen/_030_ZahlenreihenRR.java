package JavaUebungenLF08;

public class _030_Zahlenreihen {


    public static void main(String[] args) {

        // 1. 100 90 80 70 60 50 40 30 20 10
        for (int i = 100; i >= 10; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        // 2. 2000 3000 4000 5000 6000
        for (int i = 2000; i <= 6000; i += 1000) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        // 3. 2.0 1.5 1.0 0.5 0.0 -0.5 -1.0
        for (double i = 2.0; i >= -1.0; i -= 0.5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        // 4. 1,0 2,2 3,4 4,6 5,8 7,0 8,2 9,4
        // (mit Komma statt Punkt ausgeben)
        double wert = 1.0;
        for (int j = 0; j < 8; j++) {
            System.out.print(String.format("%.1f", wert).replace('.', ',') + " ");
            wert += 1.2;
        }
        System.out.println("\n");


        // 5. Z5 Z7 Z9 Z11 Z13
        for (int i = 5; i <= 13; i += 2) {
            System.out.print("Z" + i + " ");
        }
        System.out.println("\n");


        // 6. Summe von 1 bis 20
        int summe = 0;
        for (int i = 1; i <= 20; i++) {
            summe += i;
        }
        System.out.println("Summe 1 bis 20 = " + summe + "\n");


        // 7. a2b3 a12b13 a22b23
        for (int i = 2; i <= 22; i += 10) {
            System.out.print("a" + i + "b" + (i + 1) + " ");
        }
        System.out.println("\n");


        // 8. 13 17 21 29 33 37 45
        int[] zahlen = {13, 17, 21, 29, 33, 37, 45};
        for (int z : zahlen) {
            System.out.print(z + " ");
        }
        System.out.println("\n");


        // 9. 1 2 3 4 5 4 3 2 1
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                System.out.print(i + " ");
            } else {
                System.out.print((10 - i) + " ");
            }
        }
        System.out.println("\n");


        // 10. while-Schleife: 1–39 und 61–100
        int i = 1;
        while (i <= 100) {
            if (i <= 39 || i >= 61) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
