package assignment.practical5;

import java.util.Scanner;

class UserMainCode2 {
    public static int getVowels(String inputString) {
        String vowels = "aeiouAEIOU";
        for (char vowel : vowels.toCharArray()) {
            if (inputString.indexOf(vowel) == -1) {
                return -1;
            }
        }
        return 1;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int result = UserMainCode2.getVowels(inputString);
        if (result == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
