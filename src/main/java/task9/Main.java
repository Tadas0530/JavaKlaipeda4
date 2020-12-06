package task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
            for (int row = 1; row <= n; row++) {
                for (int i = 0; i < n; i++) {
                    for (int col = 1; col < n * 2; col++) {
                        if (row == col || col == n * 2 - row) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }

