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

    @Test
    public void InputValueisThree(){
        FizzBuzz fb = new FizzBuzz();
        int number = 3;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Fizz",Output);
    }
    @Test
    public void InputValueisMultipleofThree(){
        FizzBuzz fb = new FizzBuzz();
        int number = 9;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Fizz",Output);
    }

    @Test
    public void InputValueisFive(){
        FizzBuzz fb = new FizzBuzz();
        int number = 5;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Buzz",Output);
    }

    @Test
    public void InputValueisMultpileofFive(){
        FizzBuzz fb = new FizzBuzz();
        int number = 10;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Buzz",Output);
    }
    @Test
    public void InputValueisMultpileofThreeandFive(){
        FizzBuzz fb = new FizzBuzz();
        int number = 30;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals("Fizz Buzz",Output);
    }

    @Test
    public void ForAllOtherValues(){
        FizzBuzz fb = new FizzBuzz();
        int number = 26;
        String Output = fb.fizzbuzzer(number);
        Assert.assertEquals(Integer.toString(number),Output);
    }
}