package task5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int x = scanner.nextInt();
        if(x < 0) {
            return;
        }
        for(int i = 2; i <= x; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
