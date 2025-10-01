package _030_Zahlenreihen;

public class _030_ZahlenreihenJG {


        public static void main(String[] args) {

            /* 1.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * 100 90 80 70 60 50 40 30 20 10
             */
             for (int i = 100; i >= 10; i -= 10) {
             System.out.print(i + " ");


            /* 2.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * 2000 3000 4000 5000 6000
             */
            //for (int j = 2000; j <= 6000; j += 1000) {
            //        System.out.print(j + " ");

            /* 3.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * 2.0 1.5 1.0 0.5 0.0 -0.5 -1.0
             */
            //for (float l = 2.0F; l> -1.5; l -= 0.5F){
            //    System.out.print(l + " ");
            //}

            /* 4.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * 1,0 2,2 3,4 4,6 5,8 7,0 8,2 9,4
             */
            //for (double m = 1.0F; m < 9.4; m += 1.2F) {
            //    System.out.print(String.format("%.1f ",m));

            /* 5.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * Z5 Z7 Z9 Z11 Z13
             */
            //for (int n = 5; n <= 13; n += 2) {
            //    System.out.print("Z" + n + " ");

            /* 6.
             * Schreibe ein Programm, das per for-Schleife
             * alle Zahlen von 1 bis 20 addiert
             * und danach das Endergebnis ausgibt.
             */
            //int result = 0;
            //for (int o = 1; o <= 20; o++){
            //    result +=o;
            //      System.out.println(result);
            // }


            /* 7.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * a2b3 a12b13 a22b23
             */
            //for (int p = 2; p <= 22; p += 10) {
            //    int q= p+1;
            //    System.out.print("a" + p + "b" + q +" ");
            // }


            /* 8.
             * Schreibe eine for-Schleife, die Folgendes ausgibt:
             * 13 17 21 29 33 37 45
             */
            //int zahl = 13;
            //for (int r = 0; r < 7; r++) {
            //    System.out.print(zahl + " ");
            //    if (r % 3 == 2) {
            //        zahl += 8;
            //    } else {
            //        zahl += 4;
            //    }
            //    }
            //}

            /* 9.
             * Schreibe EINE for-Schleife, die Folgendes ausgibt:
             * 1 2 3 4 5 4 3 2 1
             */

            //for (int i = 1; i <= 9; i++) {
            //    int zahl = 5 - Math.abs(5 - i);
            //    System.out.print(zahl + " ");
            //}
            //}
            //}

            /* 10.
             * Schreibe ein Programm, das mit EINER while-Schleife
             * alle natürlichen Zahlen von 1 bis 39 sowie 61 bis 100
             * (jeweils einschließlich) der Größe nach ausgibt:
             * 1 2 3 4 ..... 36 37 38 39 61 62 63 64 ... 97 98 99 100
             */
            //int zahl = 1;

            //while (zahl <= 100) {
            //    if (zahl <= 39 || zahl >= 61) {
            //        System.out.print(zahl + " ");
            //    }
            //    zahl++;
            //}
        }
    }
}

