package assignment.practical6;

import java.util.Scanner;

class UserMainCode {
    public static int oddDigitSum(String[] inputArray, int size) {
        int sum = 0;

        for (int i = 0; i < size; i++) {
            String currentString = inputArray[i];
            for (char c : currentString.toCharArray()) {
                if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    if (digit % 2 != 0) {
                        sum += digit;
                    }
                }
            }
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] inputArray = new String[n];
        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }

        int result = UserMainCode.oddDigitSum(inputArray, n);
        System.out.println("Sum of odd digits: " + result);

        scanner.close();
    }
}
