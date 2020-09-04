import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest{
    @Test
    public void InputValuelessthanOne(){

        FizzBuzz fb = new FizzBuzz();
        int number = 0;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Invalid Input",Output);
    }

    @Test
    public void InputValueisOne(){
        FizzBuzz fb = new FizzBuzz();
        int number = 1;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("1",Output);
    }
    @Test
    public void InputValueisTwo(){
        FizzBuzz fb = new FizzBuzz();
        int number = 2;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("2",Output);
    }
}