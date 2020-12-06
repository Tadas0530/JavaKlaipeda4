package task8;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        float number = scanner.nextFloat();
        System.out.println("Enter your symbol: ");
        String symbol = scanner.next();
        System.out.println("Enter number2: ");
        float number2 = scanner.nextFloat();

        float result;

        switch (symbol) {
            case "+":
                result = number + number2;
                System.out.println("Result is: " + result);
                break;
            case "-":
                result = number - number2;
                System.out.println("Result is: " + result);
                break;
            case "*":
                result = number * number2;
                System.out.println("Result is: " + result);
                break;
            case "/":
                result = number / number2;
                System.out.println("Result is: " + result);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}