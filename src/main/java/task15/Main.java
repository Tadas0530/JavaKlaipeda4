package task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input 10 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 0;
        while (i < 10) {
            System.out.println("Number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < numbers.length; j++) {
            for (int k = 0; k < numbers.length; k++) {
                if ((numbers[j] == numbers[k]) && (j != k)) {
                    System.out.println(numbers[k]);
                }
            }
        }
    }

}

