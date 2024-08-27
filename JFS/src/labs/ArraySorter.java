package labs;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySorter {
    public static int[] getSorted(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reverseNumber(numbers[i]);
        }
        Arrays.sort(numbers);
        return numbers;
    }
    private static int reverseNumber(int number) {
        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Integer.parseInt(reversedString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] sortedNumbers = getSorted(numbers);
        System.out.println("Sorted array after reversing each number:");
        System.out.println(Arrays.toString(sortedNumbers));
    }
}

