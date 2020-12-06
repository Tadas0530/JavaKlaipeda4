package task11;

import java.util.Scanner;

public class LongestText {
    private static final String STOP = "Enough";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int textLength = 0;
        String longestString = "No text provided";
        while (true) {
            System.out.println("Enter text:");
            String text = scanner.nextLine();
            if (text.equalsIgnoreCase(STOP)) {
                if (!longestString.equals("No text provided")) {
                    System.out.println("___Your longest text___ \n" + longestString);
                } else {
                    System.out.println(longestString);
                }
                break;
            }
            if (text.length() > textLength) {
                longestString = text;
            }
            textLength = Math.max(text.length(), textLength);
        }
    }
}

