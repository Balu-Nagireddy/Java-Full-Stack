package labs;
import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is an increasing number
    public static boolean checkNumber(int number) {
        // Convert the number to a string to access each digit
        String numStr = Integer.toString(number);

        // Iterate through the digits of the number
        for (int i = 1; i < numStr.length(); i++) {
            // Compare each digit with the previous one
            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                // If any digit is less than the previous one, return false
                return false;
            }
        }
        // If all digits are in increasing order, return true
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is an increasing number and print the result
        if (checkNumber(number)) {
            System.out.println(number + " is an increasing number.");
        } else {
            System.out.println(number + " is not an increasing number.");
        }

        // Close the scanner
        scanner.close();
    }
}

