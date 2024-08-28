package assignment.practical4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color code:");
        String colorCode = scanner.nextLine();
        int result = UserMainCode3.validateColorCode(colorCode);
        if (result == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}
