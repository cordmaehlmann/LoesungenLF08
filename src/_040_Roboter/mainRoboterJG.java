package _040_Roboter;

import java.util.Scanner;


public class mainRoboterJG {
    // Datei: _050_EigeneKlasse._050_Daniel.Main.java

    public static void main(String[] args) {
      //  {
            // Test 1: Konstruktoren
            _040_RoboterJG robo1 = new _040_RoboterJG("Herbert");
            _040_RoboterJG robo2 = new _040_RoboterJG("Bernd");
            System.out.println(robo1.getName() + " und " + robo2.getName()); // Herbert und Herbert


            // Test 2: Umbenennen
            _040_RoboterJG robo3 = new _040_RoboterJG("Stefan");
            System.out.println(robo3.getName()); // Stefan
            robo3.setName("Bernd");
            System.out.println(robo3.getName()); // Herbert


            // Weitere Tests (optional)
            _040_RoboterJG robo4 = new _040_RoboterJG("bernd");
            System.out.println(robo4.getName()); // erwartet: bernd (Kleinschreibung wird nicht automatisch ersetzt)


            robo4.setName("Bernd");
            System.out.println(robo4.getName()); // Herbert


//}

    //    {
            Scanner sc = new Scanner(System.in);

            System.out.print("Gib einen Roboternamen ein: ");
            String input = sc.nextLine();

            _040_RoboterJG robo = new _040_RoboterJG(input);
            System.out.println("Der Roboter heißt jetzt: " + robo.getName());

            sc.close();



        robo4.setName("Best Friend");
        System.out.println(robo4.getName()); // Hesham
   //     }
    }
}


