package Day_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class classesAndObjects {

public static class Car {
    String owner;
    String make;
    String model;
    // Ideally a lot of these objects would be private, but It's not always easier than leaving the object public.
    // This can be why you need getters and setters
    private int yearBuilt;
    // Principle of encapsulation, you only expose data into classes you actually need to have to protect the data
    // from bad actors or anyone that makes a mistake
    public void setYearBuilt(int i){
        if(i <= 2022) {
            yearBuilt = i;
        }
    }
    public Car(String make, String model, int yearBuilt, String owner){
        // this piece of code is called a constructor so if you need to get the user to enter data into a class
        // this is how and this is demonstrated below, side note you can have multiple constructors as long as you use them
        this.make = make;
        this.model = model;
        this.yearBuilt = yearBuilt;
        this.owner = owner;
    }
    // This is an example of getters and setters, it is a way of adding extra validation when you want to add something
    // to the class
    public String getModel(){
        return this.model;
    }
    public String setModel(String newModel){
        return this.model = newModel;
    }

}

}

