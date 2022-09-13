package Day_2;

public class Critter_Type_One extends Critter {

    public Critter_Type_One(String name, boolean isAlive, int foodLevel, int tiredNess, int fitness, int energy) {
        super(name, isAlive, foodLevel, tiredNess, fitness, energy);

    }

    public void sleep() throws InterruptedException {
        System.out.println(name + " is going to sleep now!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Snooooooore!");
        }
    }

    public void feed() throws InterruptedException {
        System.out.println(this.name + " is eating!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Nom...Nom...Nom...");
        }
    }

    public void exercise() throws InterruptedException {
        System.out.println(this.name +  "has began to exercise!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Bang!");
        }
    }
}
