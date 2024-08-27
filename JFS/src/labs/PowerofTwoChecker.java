package labs;
import java.util.Scanner;

public class PowerofTwoChecker {

    // Method to check if a number is a power of two
    public static boolean checkNumber(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is a power of two and print the result
        if (checkNumber(number)) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

