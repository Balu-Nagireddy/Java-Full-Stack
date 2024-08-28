package assignment.practical4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        String result = UserMainCode2.concatString(str1, str2);
        System.out.println("The Resultant concatenated String is : "+result);

        scanner.close();
    }
}