package assignment.practical2;

import java.util.Scanner;

class UserMainCode8 {
    public static int getSumOfPower(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], i);
        }
        return sum;
    }
}

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = UserMainCode8.getSumOfPower(arr);
        System.out.println("The sum of powers is: " + result);
        scanner.close();
    }
}

