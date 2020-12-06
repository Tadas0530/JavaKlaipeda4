package IDvalidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonalNumber {
    public void validate(String personalNumber) {
        String validRegex = "^([1-6])([0-9]{10})$";
        if (personalNumber.matches(validRegex)) {
            String[] personalNumDigits = personalNumber.split("");
            int lastNumber = Integer.parseInt(personalNumDigits[10]);
            if(isDateValid(personalNumDigits)) {
                if (controlNumber(personalNumDigits) == lastNumber) {
                    System.out.println("Asmens kodas teisingas");
                } else {
                    System.out.println("Neteisingas kontrolinis skaicius " + "(" +
                            + controlNumber(personalNumDigits) + ")");
                }
            } else {
                System.out.println("Neteisingi gimimo metai");
            }
        } else {
            System.out.println("Asmens kodas privalo buti sudarytas is 11 skaitmenu");
        }
    }

    private boolean isDateValid(String[] personalNumDigits) {
        String century = personalNumDigits[0];
        String first2YearDigits = "", date;
        String year = personalNumDigits[1] + personalNumDigits[2];
        String month = personalNumDigits[3] + personalNumDigits[4];
        String day = personalNumDigits[5] + personalNumDigits[6];
        switch (century) {
            case "1":
            case "2":
                first2YearDigits = "18";
                break;
            case "3":
            case "4":
                first2YearDigits = "19";
                break;
            case "5":
            case "6":
                first2YearDigits = "20";
                break;
        }
        date = first2YearDigits + year + "-" + month + "-" + day;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        try {
            format.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    private int controlNumber(String[] personalNumDigits) {
        int sum = 0;
        int[] valuesToInt = new int[personalNumDigits.length];
        for (int i = 0; i < personalNumDigits.length; i++) {
            valuesToInt[i] = Integer.parseInt(personalNumDigits[i]);
        }
        for (int i = 0; i < personalNumDigits.length - 2; i++) {
            sum += valuesToInt[i] * (i + 1);
        }
        sum += valuesToInt[9];
        if (sum % 11 != 10) {
            return sum % 11;
        }
        sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += valuesToInt[i] * (i + 3);
        }
        for (int i = 7; i < 10; i++) {
            sum += valuesToInt[i] * (i - 6);
        }
        if (sum % 11 != 10) {
            return sum % 11;
        } else {
            return 0;
        }
    }
}