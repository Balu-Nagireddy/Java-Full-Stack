package labs;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Create an array dynamically based on user input
        int[] array = new int[size];
        // Input: Array elements bgx
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Reverse the array
        int start = 0;
        int end = size - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        // Output: Reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
