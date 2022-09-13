package Day_2;

public class Bread implements Food{ // new class that implements the interface 

    private String name = "Bread"; // creating elements of the class

    private int energy = 2;

    public void applyFood(Critter critter) throws InterruptedException{ // method that catches exception 
            critter.feed(this); // feed method, feeds in food 
            critter.setEnergy(energy++); // adds energy but it could be written as critter.setEnergy(critter.getEnergy() + energy);

    }

}
