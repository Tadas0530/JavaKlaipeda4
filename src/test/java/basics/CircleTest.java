package basics;

import FundamentalsTesting.Circle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testCirclePerimeter() {
        // given
        Circle circle = new Circle(5);

        // when
        double perimeter = circle.calculateCirclePerimeter();

        // then
        Assertions.assertThat(perimeter).isEqualTo(31.41592653589793);
    }

    @Test
    public void testCircleArea() {
        // given
        Circle  circle = new Circle(5);

        // when
        double area = circle.calculateCircleArea();

        // then
        Assertions.assertThat(area).isEqualTo(78.53981633974483);
    }
}
