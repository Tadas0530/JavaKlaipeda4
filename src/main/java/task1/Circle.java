package task1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diameter = scanner.nextFloat();
        float result = (float) (diameter * Math.PI);
        System.out.println(result);
    }
}
