package basics;

import FundamentalsTesting.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(2, 4);

        // then
        assertEquals(6, result);
    }

    @Test
    public void testDivision() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(10,5);

        // then
        assertEquals(2, result);
    }

    @Test
    public void testSubtract() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(10,5);

        // then
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(10,5);

        // then
        assertEquals(50, result);
    }
}
