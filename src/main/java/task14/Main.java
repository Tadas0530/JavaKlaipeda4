package task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().toLowerCase().charAt(0);
        char char2 = scanner.next().toLowerCase().charAt(0);

        int result = char1 - char2;
        if(result < 0) {
            System.out.println(result * (-1));
        } else {
            System.out.println(result);
        }
    }
}
