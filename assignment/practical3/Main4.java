package assignment.practical3;

import java.util.Scanner;

class UserMainCode4 {
    public static int calculateElectricityBill(int previousReading, int currentReading, int perUnitCharge) {
        int unitsConsumed = currentReading - previousReading;
        return unitsConsumed * perUnitCharge; // Calculate the bill
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter previous reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter current reading: ");
        int currentReading = scanner.nextInt();

        System.out.print("Enter charge per unit: ");
        int perUnitCharge = scanner.nextInt();

        int bill = UserMainCode4.calculateElectricityBill(previousReading, currentReading, perUnitCharge);
        System.out.println("The current electricity bill is: " + bill);

        scanner.close();
    }
}

