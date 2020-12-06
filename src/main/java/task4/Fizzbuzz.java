package task4;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int x = scanner.nextInt();
        if(x > 0) {
            for (int i = 1; i <= x; i++) {
                if ((i % 3 == 0) && (i % 7 == 0)) {
                    System.out.println("Fizz buzz");
                } else if (i % 7 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("You entered a negative number");
        }
    }
}
