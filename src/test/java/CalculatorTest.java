import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;

    @Before
    public void setup(){
        myCalculator = new Calculator();
    }

    @Test
    public void canAdd(){

        assertEquals(5,myCalculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(8,myCalculator.subtract(16,8));
    }

    @Test
    public void canMultiply(){
        assertEquals(16,myCalculator.multiply(4,4));
    }

    @Test
    public void canDivide(){
        assertEquals(32,myCalculator.divide(64,2));
    }
}
