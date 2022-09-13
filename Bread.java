package Day_2;

public class Bread implements Food{

    private String name = "Bread";

    private int energy = 2;

    public void applyFood(Critter critter) throws InterruptedException{
            critter.feed(this);
            critter.setEnergy(energy++);

    }

}