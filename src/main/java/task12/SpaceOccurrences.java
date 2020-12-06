package task12;

import java.util.Scanner;

public class SpaceOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        double spaceCount = 0;
        double percentage;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isSpaceChar(text.charAt(i))) {
                spaceCount++;
            }
        }
        percentage = (spaceCount / text.length()) * 100d;
        System.out.println("Space char occurs " + percentage + "% of the text");
    }
}
