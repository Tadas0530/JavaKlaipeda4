package task7;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = scanner.nextInt();
        if (length < 0) {
            return;
        }
        System.out.println(calcFibonacci(length));
    }

    public static int calcFibonacci(int n) {
        int point1 = 0, point2 = 1;
        int number = 0;
        for (int i = 1; i <= n; i++) {
            point1 = point2;
            point2 = number;
            number = point1 + point2;
        }
        return number;
    }
}
