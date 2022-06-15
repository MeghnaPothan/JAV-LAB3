//Meghna Aravind A00256942
//Athul Babu A00244116
// JAV1001 Lab 3
//Program to demonstrate classes and objects

import java.text.DateFormatSymbols;

public class DiceGame {

    public static void main(String[] args) {
        System.out.println("Creating a default d6");
        Die defaultdied6 = new Die(); // No parameter constructor
        Die d20die = new Die(20);// Constructor with one param
        System.out.println("Creating a percentile die");
        Die percentile = new Die(10, "Percentile"); // Constructor with two params

        System.out.println("Current side up of d6 is " + defaultdied6.getCurrentSideUp());
        System.out.println("Current side up of d20 is " + d20die.getCurrentSideUp());
        System.out.println("Current side up of percentile is " + percentile.getCurrentSideUp());

        System.out.println("\nTesting the roll method\n");

        System.out.println("Rolling the d6");
        defaultdied6.rollDie();
        System.out.println("The new value is " + defaultdied6.getCurrentSideUp());

        System.out.println("Rolling the d20");
        d20die.rollDie();
        System.out.println("The new value is " + d20die.getCurrentSideUp());

        System.out.println("Rolling the percentile");
        percentile.rollDie();
        System.out.println("The current side up for d20 is " + percentile.getCurrentSideUp());

        System.out.println("Setting d20 to show 20");
        while (d20die.getCurrentSideUp() != 20) {// running loop until current side up is 20

            d20die.rollDie();
        }
        System.out.println("The side up is now 20 finally.");

        System.out.println("\nBonus\n");
        BonusMethod(); // new method to do the bonus stuff

    }

    static void BonusMethod() {
        System.out.println("Creating 5 d6");
        Die d6One = new Die();
        Die d6Two = new Die();
        Die d6Three = new Die();
        Die d6Four = new Die();
        Die d6Five = new Die();
        int count = 0;
       
        while (checkIfAllSideSame(d6One, d6Two, d6Three, d6Four, d6Five)) {
            d6One.rollDie();
            d6Two.rollDie();
            d6Three.rollDie();
            d6Four.rollDie();
            d6Five.rollDie();
            count++;
        }
        
        System.out.println("YAHTZEE! It took " + count + " rolls");
    }

    private static boolean checkIfAllSideSame(Die d6One, Die d6Two, Die d6Three, Die d6Four, Die d6Five) {
        if(d6One.getCurrentSideUp()==d6Two.getCurrentSideUp()
        && d6Two.getCurrentSideUp()==d6Three.getCurrentSideUp()
        && d6Three.getCurrentSideUp()==d6Four.getCurrentSideUp()
        && d6Four.getCurrentSideUp()==d6Five.getCurrentSideUp()
        )
        return false;
        else
        return true;
    }
}