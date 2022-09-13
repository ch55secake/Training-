package Day_2;

import java.util.Scanner;

public class CritterMainScanner {
    public static void main(String[] args) {
        Scanner typeOfCritter = new Scanner(System.in); // setup to take user inputs
        System.out.println("Pick a critter? A or B:");
        String userChoice = typeOfCritter.nextLine(); // storing the user input 
        System.out.println("You have chosen " + userChoice); // proving to the user what they have chosen 

        Critter critter; // creating object

        if (userChoice.equals("a")) { 
            critter = new Critter("Jim", true, 0, 0, 0, 0); // new Critter object
            while (critter.isAlive()) {
                System.out.println("Critter has low energy and must sleep!");
                try {
                    critter.sleep();           // commented on in previous file see there 
                    Food b = new Bread();      //
                    b.applyFood(critter);      //
                    critter.exercise();
                } catch (InterruptedException e) {
                    e.printStackTrace(); // debug as a way to see the exception error 
                    throw new RuntimeException(e);

                }

            }



            } else if (userChoice.equals("b")){ // same method as seen above, see comments 
              Critter_Type_One critter_type_one; // creating object 
              critter_type_one = new Critter_Type_One("John", true, 0, 0, 1, 0);
                while (critter_type_one.isAlive()) {
                    System.out.println("Critter has low energy and must sleep!");
                    try {
                        critter_type_one.sleep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        Food b = new Bread();
                        b.applyFood(critter_type_one);
                        critter_type_one.exercise();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
            }

        }
    }
}

