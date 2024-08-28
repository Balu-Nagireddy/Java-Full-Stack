package assignment.practical6;

import java.util.Scanner;

class UserMainCode3 {
    public static String getString(String input, int n) {
        if (n > input.length()) {
            return "Error: n exceeds the length of the string.";
        }
        String lastNChars = input.substring(input.length() - n);
        return lastNChars.repeat(n);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        
        String result = UserMainCode3.getString(inputString, n);
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}

