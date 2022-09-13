package Day_2;

public class Critter {
    String name;
    private boolean isAlive;
    private int foodLevel;
    private int tiredNess;
    private int fitness;
    private int energy;


    public Critter(String name, boolean isAlive, int foodLevel, int tiredNess, int fitness, int energy) {
        this.name = name;
        this.isAlive = isAlive;
        this.foodLevel = foodLevel;
        this.tiredNess = tiredNess;
        this.fitness = fitness;
        this.energy = energy;

    }

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

    public void exercise() throws InterruptedException {
        if (energy > 5) {
            System.out.println("Jim has began to exercise!");
            for (int i = 5; i >= 0; i--) {
                Thread.sleep(1000);
                System.out.println("Clank!");
                setFitness(+1);
            }
            System.out.println("Critter's fitness is now " + fitness);
        }


    }

    public void sleep() throws InterruptedException {
        System.out.println(this.name + " is going to sleep now!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Zzzzzzzzzz!");
            setEnergy(1);
        }

    }

    public void feed(Food Bread) throws InterruptedException {
        System.out.println(this.name + " is eating!");
        for (int i = 5; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("Chewing......");
        }
        setFoodLevel(foodLevel + 5);
        System.out.println(this.name + "'s food level is now " + this.foodLevel);
        System.out.println(getEnergy());

    }


    public static void main(String[] args) {
        Critter critterA = new Critter("Jim", true, 0, 0, 0, 0);
        while (critterA.isAlive()) {
            if (critterA.energy <= 5) {
                System.out.println("Critter has low energy and must sleep!");
                try {
                    critterA.sleep();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Food b = new Bread();
                    b.applyFood(critterA);
                    critterA.getEnergy();
                    critterA.exercise();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

                }
            }
        }
    }
}


