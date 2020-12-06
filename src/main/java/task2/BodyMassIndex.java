package task2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        float weight = scanner.nextFloat();
        System.out.println("Enter your height");
        int height = scanner.nextInt();

        float countBMI = (weight / (height * height)) * 10000;

        if(countBMI >= 18.5f && countBMI <= 24.9f) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
