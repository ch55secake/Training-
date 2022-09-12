public class Types_Basics {
    public static void main(String[] args){


        // Variables
        String name = "Joe";

        Integer age = 25;

        String ageAsStr = "25";

        // Functions
        // An example of how to call on a function
        boolean isAbleToDrive = canIDrive(age = 26);

        // Loops
        // Loops around based on a specification of your choice, i++ is adding on to the loop, and you can do the same with, i--
        for(int i = 0; i < 10; i++){
            System.out.println("Hello!");
            break;
        }

    }


    // You can take parameters and pass in information, you can have as many params as you want, but you don't want
    // to end up with too many.
    public String getMyName(String[] args){
        return "Oscar";

    }

    // Because it was stated that the function is boolean, that means that you have to return a value at the end of the function
    public static Boolean canIDrive(int age){
        if(age < 18) {
            return true;
        } else{
            return false;
        }
    }
}

