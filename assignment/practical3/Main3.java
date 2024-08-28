package assignment.practical3;

import java.util.Arrays;
import java.util.Scanner;

class UserMainCode3 {
    public static int getElementPosition(String[] arr, String str) {
        Arrays.sort(arr, (a, b) -> b.compareTo(a)); // Sort in reverse alphabetical order
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return i + 1; // Return position (1-based index)
            }
        }
        return -1; // Return -1 if the string is not found
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the String array: ");
        int size = scanner.nextInt();
        String[] arr = new String[size];

        System.out.println("Enter the String elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }

        System.out.print("Enter the string to find its position: ");
        String str = scanner.next();

        int position = UserMainCode3.getElementPosition(arr, str);
        if (position != -1) {
            System.out.println("The position of the string is: " + position);
        } else {
            System.out.println("String not found in the array.");
        }

        scanner.close();
    }
}

