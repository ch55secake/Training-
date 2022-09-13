package Day_2;

import java.util.Scanner;

public class CritterMainScanner {
    public static void main(String[] args) {
        Scanner typeOfCritter = new Scanner(System.in);
        System.out.println("Pick a critter? A or B:");
        String userChoice = typeOfCritter.nextLine();
        System.out.println("You have chosen " + userChoice);

        Critter critter;

        if (userChoice.equals("a")) {
            critter = new Critter("Jim", true, 0, 0, 0, 0);
            while (critter.isAlive()) {
                System.out.println("Critter has low energy and must sleep!");
                try {
                    critter.sleep();
                    Food b = new Bread();
                    b.applyFood(critter);
                    critter.exercise();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);

                }

            }



            } else if (userChoice.equals("b")){
              Critter_Type_One critter_type_one;
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

