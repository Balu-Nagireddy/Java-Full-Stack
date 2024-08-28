package assignment.practical5;

import java.util.Scanner;

class UserMainCode3 {
    public static String swapCharacter(String inputString) {
        StringBuilder swappedString = new StringBuilder();
        int length = inputString.length();

        for (int i = 0; i < length - 1; i += 2) {
            swappedString.append(inputString.charAt(i + 1));
            swappedString.append(inputString.charAt(i));
        }

        // If the length is odd, append the last character
        if (length % 2 != 0) {
            swappedString.append(inputString.charAt(length - 1));
        }

        return swappedString.toString();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = UserMainCode3.swapCharacter(inputString);
        System.out.println("Swapped string: " + result);

        scanner.close();
    }
}

