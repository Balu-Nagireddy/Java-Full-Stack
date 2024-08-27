package labs;
import java.util.Arrays;
import java.util.Scanner;
public class StringSort {
    public String[] sortAndChangeCase(String[] array) {
        if (array == null || array.length == 0) {
            return new String[0];
        }
        Arrays.sort(array);
        int middleIndex = array.length / 2;
        if (array.length % 2 != 0) {
            middleIndex++;
        }
        for (int i = 0; i < array.length; i++) {
            if (i < middleIndex) {
                array[i] = array[i].toUpperCase();
            } else {
                array[i] = array[i].toLowerCase();
            }
        }
        return array;
    }
    public void displayArray(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("The array is empty or null.");
        } else {
            for (String str : array) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringSort sorter = new StringSort();
        System.out.println("Enter the number of strings:");
        int stringCount = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray = new String[stringCount];
        System.out.println("Enter the strings:");
        for (int i = 0; i < stringCount; i++) {
            stringArray[i] = scanner.nextLine();
        }
        System.out.println("Original String Array:");
        sorter.displayArray(stringArray);
        String[] sortedStringArray = sorter.sortAndChangeCase(stringArray);
        System.out.println("Sorted and Case-Changed String Array:");
        sorter.displayArray(sortedStringArray);
        scanner.close();
    }
}

