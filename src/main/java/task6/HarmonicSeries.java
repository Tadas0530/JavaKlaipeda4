package task6;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add harmonics length:");
        int length = scanner.nextInt();
        System.out.println(calcHarmonics(length));

    }

    private static double calcHarmonics(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0d / i;
        }
        return sum;
    }
}
