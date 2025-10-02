package _050_EigeneKlasse._050_Jascha;

public class _050_EigeneKlasseJG {
	 public static void main(String[] args) {
	        SpaceMarineJG m1 = new SpaceMarineJG();
	        SpaceMarineJG m2 = new SpaceMarineJG("Titus", "Captain");

	        System.out.println(m1);
	        System.out.println(m2);
	        System.out.println("Anzahl Space Marines: " + SpaceMarineJG.getCounter());

	        m1.battleCry();
	        m2.battleCry();
	    }
	}