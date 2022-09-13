package Day_2;

public class Critter { // creating a class 
    String name;
    private boolean isAlive;
    private int foodLevel;
    private int tiredNess;
    private int fitness;
    private int energy;


    public Critter(String name, boolean isAlive, int foodLevel, int tiredNess, int fitness, int energy) { // constructing class as seen above 
        this.name = name;
        this.isAlive = isAlive;
        this.foodLevel = foodLevel;
        this.tiredNess = tiredNess;
        this.fitness = fitness;
        this.energy = energy;

    }
    // getters and setters needed for changing object values, useful for debugging if you need to print a raw value 
    public int setFoodLevel(int newFoodLevel) {
        return this.foodLevel = newFoodLevel;
    }

    public int setTiredness(int newTiredness) {
        return this.tiredNess = newTiredness;
    }

    public int setFitness(int newFitness) {
        return this.fitness = newFitness;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int setEnergy(int newEnergy) {
        return this.energy = newEnergy;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void exercise() throws InterruptedException { // exercise method, catches exception because of the Thread.sleep() method 
        if (energy > 5) {
            System.out.println("Jim has began to exercise!"); // TODO update "Jim" to this.name
            for (int i = 5; i >= 0; i--) { // looping for a neater print in console mainly 
                Thread.sleep(1000);
                System.out.println("Clank!");
                setFitness(+1); // updating fitness value as it is important for the win condition 
            }
            System.out.println("Critter's fitness is now " + fitness);
        }


    }

    public void sleep() throws InterruptedException { // sleep method, exception reason shown above 
        System.out.println(this.name + " is going to sleep now!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Zzzzzzzzzz!");
            setEnergy(1); // setting energy as reward for sleeping but this needs updating because of food interface system
        }

    }

    public void feed(Food Bread) throws InterruptedException { // pretty much same as seen above 
        System.out.println(this.name + " is eating!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Chewing......");
        }
        setFoodLevel(foodLevel + 5);
        System.out.println(this.name + "'s food level is now " + this.foodLevel);
        System.out.println(getEnergy()); // needed statement purely for testing can be removed after if needed

    }


    public static void main(String[] args) { // main method
        Critter critterA = new Critter("Jim", true, 0, 0, 0, 0); // initialising main object needed for code below 
        while (critterA.isAlive()) { // while critterA alive will keep running loop 
            if (critterA.energy <= 5) { // checking for energy, starts low anyhow 
                System.out.println("Critter has low energy and must sleep!");
                try {
                    critterA.sleep();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); // catching exceptions from above method 
                }
                try {
                    Food b = new Bread(); // creating new object
                    b.applyFood(critterA); // using method from another class to feed critter 
                    critterA.getEnergy();
                    critterA.exercise(); // calling above shown method 
                } catch (InterruptedException e) { 
                    throw new RuntimeException(e);

                }
            }
        }
    }
}


