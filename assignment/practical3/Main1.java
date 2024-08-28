package assignment.practical3;

import java.util.Scanner;

class UserMainCode1 {
    public static int validateTime(String time) {
        if (!time.toLowerCase().endsWith("am") && !time.toLowerCase().endsWith("pm")) {
            return -1; 
        }

        String timeWithoutMeridian = time.substring(0, time.length() - 2).trim();
        String[] parts = timeWithoutMeridian.split(":");
        if (parts.length != 2) {
            return -1; 
        }

        int hour, minute;
        try {
            hour = Integer.parseInt(parts[0]);
            minute = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return -1; 
        }

        if (hour < 1 || hour > 12 || minute < 0 || minute > 59) {
            return -1; 
        }

        return 1; 
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (hh:mm am/pm): ");
        String time = scanner.nextLine();
        int result = UserMainCode1.validateTime(time);
        if (result == 1) {
            System.out.println("Valid time.");
        } else {
            System.out.println("Invalid time.");
        }
        scanner.close();
    }
}

