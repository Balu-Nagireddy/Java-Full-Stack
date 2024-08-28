package assignment.practical2;

import java.util.Scanner;

class UserMainCode7 {
    public static int validatePassword(String password) {
        if (password.length() < 6 || password.length() > 20) {
            return -1;
        }
        if (!password.matches(".*\\d.*")) {
            return -1;
        }
        if (!password.matches(".*[@#$].*")) {
            return -1;
        }
        return 1;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        int result = UserMainCode7.validatePassword(password);
        if (result == 1) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        scanner.close();
    }
}

