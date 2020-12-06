package task13;

import java.util.Scanner;

public class Stutters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] stringsArray = text.split("\\s+");

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.print(stringsArray[i] + " " + stringsArray[i] + " ");
        }
    }
}
