package Day_2;

public class Bread implements Food{

    private String name = "Bread";

    private int energy = 10;

    public void applyFood(Critter critter){
        try {
            critter.feed(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}