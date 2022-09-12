public class FizzBuzz {
    public static void main(String[] args){
        int count = 0;
        for(int i = 200; i>=1; i--){
            count ++;
            if(count % 3 == 0){
                System.out.println("Fizz");
            }
            if(count % 5 == 0){
                System.out.println("Buzz");}
            if(count % 5 == 0 && count % 3 == 0){
                System.out.println("FizzBuzz");
            }
            if(count % 7 == 0){
                System.out.println("Bang!");
            if(count % 11 == 0)
                System.out.println("Bong!");
            }
            if(count % 13 == 0){
                System.out.println("Fezz");
            if(count % 13 == 0 && count % 5 == 0 && count % 3 == 0){
                System.out.println("FizzFezzBuzz");
            }
            } else {
                System.out.println(count);
            }
        }
    }
}
