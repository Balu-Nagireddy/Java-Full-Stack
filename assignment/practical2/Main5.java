package assignment.practical2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UserMainCode6 {
    public static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);

        ArrayList<Integer> result = new ArrayList<>();
        
        if (mergedList.size() > 2) result.add(mergedList.get(2));  // Element at index 2
        if (mergedList.size() > 6) result.add(mergedList.get(6));  // Element at index 6
        if (mergedList.size() > 8) result.add(mergedList.get(8));  // Element at index 8

        return result;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements for the first list:");
        int size1 = scanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter " + size1 + " integers for the first list:");
        for (int i = 0; i < size1; i++) {
            list1.add(scanner.nextInt());
        }

        System.out.println("Enter the number of elements for the second list:");
        int size2 = scanner.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter " + size2 + " integers for the second list:");
        for (int i = 0; i < size2; i++) {
            list2.add(scanner.nextInt());
        }

        scanner.close();

        ArrayList<Integer> result = UserMainCode6.sortMergedArrayList(list1, list2);

        System.out.println("Resulting list:");
        for (int number : result) {
            System.out.println(number);
        }
    }
}
