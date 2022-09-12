import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FizzBuzzV3 {

    public static void fizzBuzzBang() {
        for (int i = 255; i >= 1; i--) {
            StringBuilder stringBuilder = new StringBuilder();
            boolean fezz = false;


            if (i % 3 == 0) {
                stringBuilder.append("Fizz");

            }

            if (i % 13 == 0) {
                stringBuilder.append("Fezz");
                fezz = true;
            }

            if (i % 5 == 0) {
                stringBuilder.append("Buzz");


            }

            if (i % 7 == 0) {
                stringBuilder.append("Bang");

            }

            if (i % 11 == 0) {
                stringBuilder.delete(0, stringBuilder.length());
                if (fezz) {
                    stringBuilder.append("Fezz");
                }
                stringBuilder.append("Bong");

            }

            if (i % 17 == 0) {
                System.out.println("Test");
            }
            System.out.println(stringBuilder.length() == 0 ? i : stringBuilder.toString());
        }
    }
    public static void fizzFezzReversed(){
            List<Rule> rulesList = Arrays.asList(
                    new Rule(3, "Fizz"),
                    new Rule(13, "Fezz"),
                    new Rule(5, "Buzz"),
                    new Rule(7, "Bang"),
                    new Rule(11, "Bong")
            );
        for (int i = 255; i >= 1; i--){
            int finalI = i;
            StringBuilder stringBuilder = new StringBuilder();
            Stream<String> outputs = rulesList.stream().filter(rule -> rule.matches(finalI)).map(Rule::getOutput);

            if(i % 3 == 0){
                stringBuilder.append("Fizz");
            }

            if(i % 13 == 0){
                stringBuilder.append("Fezz");
            }

            if(i % 5 == 0){
                stringBuilder.append("Buzz");
            }

            if(i % 7 == 0){
                stringBuilder.append("Bang");
            }

            if(i % 11 == 0 ){
                outputs = outputs.filter(s -> s.equals("Fezz") || s.equals("Bong"));
            }

            List<String> outputtedList = outputs.collect(Collectors.toList());

            if (i % 17 == 0){
                Collections.reverse(outputtedList);
            }
            System.out.println(outputtedList.size() > 0 ? String.join("", outputtedList) : i);
            System.out.println(stringBuilder.length() == 0 ? i : stringBuilder.toString());

        }


        }
    public static void main(String[] args){
        fizzFezzReversed();
    }

}





