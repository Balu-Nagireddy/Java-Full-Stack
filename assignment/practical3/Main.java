package assignment.practical3;

import java.util.Scanner;

class UserMainCode {
    public static int validateDate(String date) {
        if (date.length() != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
            return -1; 
        }

        String[] parts = date.split("/");
        if (parts.length != 3) {
            return -1; 
        }

        int day, month, year;
        try {
            day = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return -1; 
        }

        if (month < 1 || month > 12) {
            return -1; 
        }

        if (day < 1 || day > 31) {
            return -1; 
        }

        if (month == 2) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear && day > 29) {
                return -1; 
            }
            if (!isLeapYear && day > 28) {
                return -1; 
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                return -1; 
            }
        }

        return 1; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a date in the format dd/mm/yyyy: ");
        String date = scanner.nextLine();
        int result = UserMainCode.validateDate(date);
        if (result == 1) {
            System.out.println("The date format is valid.");
        } else {
            System.out.println("The date format is invalid.");
        }
        scanner.close();
    }
}
