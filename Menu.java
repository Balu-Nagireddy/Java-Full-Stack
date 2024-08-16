package assignment;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Displaying the menu
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Modulus");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt(); // Read the user's choice

            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                
                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                
                case 3: // Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("Result: " + ((double) num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                
                case 4: // Modulus
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                
                case 5: // Exit
                    System.out.println("Exiting...");
                    break;
                
                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 5); // Continue the loop until the user chooses to exit
        
        scanner.close(); // Close the scanner object
    }
}

