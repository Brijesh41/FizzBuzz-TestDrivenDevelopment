import java.util.Scanner;

public class FizzBuzzApp{

    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        FizzBuzz fb = new FizzBuzz();
        int input = 1;
        while(input!=-1){
            System.out.println("Please enter a number");
            int number = in.nextInt();
            System.out.println(fb.fizzbuzzer(number));
            System.out.println("Press -1 to exit. To continue enter any number!");
            input = in.nextInt();
        }
    }
}