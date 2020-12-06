package task3;

public class QuadraticEquation {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 1;

        int delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Delta negative");
        } else {
            System.out.println(delta);
            double x1 = ((-b - Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println(x1 + " " + x2);
        }
    }
}
