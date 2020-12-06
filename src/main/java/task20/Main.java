package task20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guessNumber = 0;
        int randomNumber = random.nextInt(100);
        System.out.println("Enter your guess 0 - 100: ");
        while(randomNumber != guessNumber) {
            guessNumber = scanner.nextInt();
            if(guessNumber > randomNumber) {
                System.out.println("Too much!");
            } else if(guessNumber < randomNumber) {
                System.out.println("Not enough");
            } else {
                System.out.println("Congratulations!");
            }
        }
    }
}
