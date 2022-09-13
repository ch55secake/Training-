package Day_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class usingTheClass {

    // As shown you can have many variables pointing to the same object and below we are creating new instances of
    // the class.
    public static void filteringCars() {
        List<classesAndObjects.Car> carsOfPeople = Arrays.asList(
                new classesAndObjects.Car("Ford", "Focus", 2018, "Jim"),
                new classesAndObjects.Car("Honda", "Civic", 2010, "Connor"),
                new classesAndObjects.Car("Ferrari", "458", 2021, "Pam"));

        // Tying in the knowledge from streams and classes, remember the little arrow is called a lambda
    //    List<classesAndObjects.Car> filtered =
                carsOfPeople
                        .stream()
                        .filter(car -> car.owner.equals("Jim"))
                                .forEach(car -> System.out.println(car));



   //     System.out.println(filtered);
    }
    public static void main(String[] args){
        filteringCars();


    }
    // Setting this protects the program from any bad data.
    // alicesCar.yearBuilt(2022)
    // You can also have objects have no variables pointing at them, like if alice bought a new car
    // alicesCar = new Car();
}
