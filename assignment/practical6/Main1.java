package assignment.practical6;

import java.util.HashSet;
import java.util.Scanner;

class UserMainCode1 {
    public static int getUnique(int number) {
        String numStr = String.valueOf(number);
        HashSet<Character> digitSet = new HashSet<>();

        for (char digit : numStr.toCharArray()) {
            if (!digitSet.add(digit)) {
                return 0; // Not unique
            }
        }
        return 1; // Unique
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        int result = UserMainCode1.getUnique(inputNumber);
        if (result == 1) {
            System.out.println("Unique");
        } else {
            System.out.println("Not Unique");
        }

        scanner.close();
    }
}

