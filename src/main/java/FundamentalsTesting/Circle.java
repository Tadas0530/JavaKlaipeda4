package FundamentalsTesting;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCirclePerimeter() {
        // C=2πr
        return 2.0d * Math.PI * radius;
    }

    public double calculateCircleArea() {
        // πr2
        return Math.PI * Math.pow(radius, 2);
    }

}
