import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest{
    @Test
    public void InputValuelessthan(){

        FizzBuzz fb = new FizzBuzz();
        int number = 0;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Invalid Input",Output);
    }
}