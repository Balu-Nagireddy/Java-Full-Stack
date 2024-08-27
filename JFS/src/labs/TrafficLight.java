package labs;
import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a light:\n1. Red\n2. Yellow\n3. Green");
        System.out.println("Enter Your Option : ");
        int choice = scanner.nextInt();       
        switch (choice) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close(); // Close the scanner
    }
}


