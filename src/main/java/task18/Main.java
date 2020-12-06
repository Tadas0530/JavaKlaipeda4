package task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(text.matches("acho+!")) {
            System.out.println("Bless you");
        }
    }
}
