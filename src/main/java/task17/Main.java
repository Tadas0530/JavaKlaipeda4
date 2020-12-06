package task17;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of your next SDA classes: ");
        String date = scanner.nextLine();
        LocalDate userDate = LocalDate.parse(date); // YYYY - MM - DD
        long daysUntil = ChronoUnit.DAYS.between(LocalDate.now(), userDate);
        System.out.println("Days until your next classes: " + daysUntil + ".");
    }
}