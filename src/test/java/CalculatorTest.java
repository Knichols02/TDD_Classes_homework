import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals( 4, calculator.add(2,2) );
    }

    @Test
    public void subtract(){
        assertEquals(5, calculator.subtract(10,5));
    }

    @Test
    public void multiply(){
        assertEquals(25, calculator.multiply(5,5));
    }

    @Test
    public void divide(){
        assertEquals(17.5, calculator.divide(35,2), 0.0);
    }
}
