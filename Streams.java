package Day_2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    // What is a stream?
    // A good example of what a stream is, it's like a conveyor belt, and you can put steps up and down the conveyor.
    // You are able to easily manipulate the data within the stream.
    public static void main(String[] args){

        String[] allPupils = {"Josh", "John", "Joe", "jim", "Sam", "Amy", "lucy"};

       Arrays.stream(allPupils)
               // You have to return a value to map, you can't map through an empty index.
                .map(name -> name.toUpperCase())
               // You can filter through the list and check if it is equal or matches or anything you want to check.
                .filter(name -> name.matches("Joe"))
               // Syntax does what it says it does, doesn't much explanation
                .collect(Collectors.toList())
               // The logic for forEach is very similar to a for loop as it loops through the values given in map
                .forEach(name -> System.out.println(name));
    }
}
