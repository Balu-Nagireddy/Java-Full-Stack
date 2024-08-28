package assignment.practical5;

import java.util.Scanner;

class UserMainCode {
    public static String nameFormatter(String fullName) {
        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];
        char initial = firstName.charAt(0);
        return lastName + ", " + initial + ".";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the person's name (FirstName LastName): ");
        String fullName = scanner.nextLine();

        String formattedName = UserMainCode.nameFormatter(fullName);
        System.out.println("Formatted name: " + formattedName);

        scanner.close();
    }
}

