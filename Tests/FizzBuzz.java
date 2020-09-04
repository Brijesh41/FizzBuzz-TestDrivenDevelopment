public class FizzBuzz {
    public String fizzbuzzer(int number){
        if(number<=0) return "Invalid Input";

        if(number==1) return Integer.toString(1);

        if(number==2) return Integer.toString(2);

        if(number%3==0) return "Fizz";

        return null;
    }
}
