package basics.TDD;

import FundamentalsTesting.FibonacciSequence;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {
    @Test
    public void shouldReturnZeroForFirstElement() {
        // given
        FibonacciSequence fibonacci = new FibonacciSequence();

        // when
        int result = fibonacci.getValue(0);

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForSecondElement() {
        // given
        FibonacciSequence fibonacci = new FibonacciSequence();

        // when
        int result = fibonacci.getValue(1);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnFibonacciNumber() {
        // given
        FibonacciSequence fibonacci = new FibonacciSequence();

        // when
        int result = fibonacci.getValue(3);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }
}
