package fibonacci;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNagetive(){
        Febonacci febonacci = new Febonacci();
        int negetiveFibonacci = febonacci.find(-10);
       assertEquals(-1,negetiveFibonacci);

    }
}
