package task16;

import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, number1, currentSub = 0, longestSub = 1, currentNum = 0;
        while (i < 10) {
            number1 = scanner.nextInt();
            i++;
            if (number1 > currentNum) {
                currentSub++;
                longestSub = Math.max(currentSub, longestSub);
            } else {
                currentSub = 1;
            }
            currentNum = number1;
        }
        System.out.println("Longest subsequence: " + longestSub);
    }
}
