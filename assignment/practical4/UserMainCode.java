package assignment.practical4;

import java.util.Scanner;

public class UserMainCode {

    public static int sumOfDigits(String input) {
        int sum = 0;
        boolean hasDigit = false;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
                hasDigit = true;
            }
        }
        return hasDigit ? sum : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int result = sumOfDigits(input);
        System.out.println("The sum of digits in the string is: " + result);
        scanner.close();
    }
}

