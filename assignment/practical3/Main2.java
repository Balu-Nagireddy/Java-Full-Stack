package assignment.practical3;

import java.util.Scanner;

class UserMainCode2 {
    public static int getBigDiff(int[] arr) {
        if (arr.length == 1) {
            return arr[0]; 
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num; 
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        if (size < 1) {
            System.out.println("Size of the array must be >= 1");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = UserMainCode2.getBigDiff(arr);
        System.out.println("The difference between the largest and smallest element is: " + result);
        scanner.close();
    }
}

