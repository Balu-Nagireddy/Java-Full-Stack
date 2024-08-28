package assignment.practical5;

import java.util.Scanner;

class UserMainCode4 {
    public static String getFormattedString(String inputString) {
        String[] names = inputString.split(" ");
        if (names.length < 3) {
            return "Invalid input. Please provide a full name.";
        }

        String firstName = names[0];
        String middleName = names[1];
        String lastName = names[2];

        return lastName + " " + middleName.charAt(0) + "." + firstName.charAt(0) + ".";
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a full name (first middle last): ");
        String inputString = scanner.nextLine();

        String result = UserMainCode4.getFormattedString(inputString);
        System.out.println("Formatted name: " + result);

        scanner.close();
    }
}

