package assignment.practical5;

import java.util.Scanner;

class UserMainCode1 {
    public static String removeCharacter(String inputString, char characterToRemove) {
        return inputString.replace(Character.toString(characterToRemove), "");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char characterToRemove = scanner.next().charAt(0);

        String cleanedString = UserMainCode1.removeCharacter(inputString, characterToRemove);
        System.out.println("Final string: " + cleanedString);

        scanner.close();
    }
}
