package task10;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        printSumOfDigits(scanner.nextInt());
    }

    private static void printSumOfDigits(int n) {
        int sum = 0, digit;
        for (int i = 1; true; i *= 10) {
            sum += (n / i) % 10;
            digit = (n / i) % 10;
            if(digit == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}