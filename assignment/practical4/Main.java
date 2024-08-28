package assignment.practical4;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of entries in the hashmap:");
        int n = Integer.parseInt(scanner.nextLine().trim());
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter key " + (i + 1) + ":");
            int key = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Enter value for key " + key + ":");
            String value = scanner.nextLine().trim();
            map.put(key, value);
        }
        int resultSize = UserMainCode1.sizeOfResultandHashMap(map);

        System.out.println("The size of the resultant hashmap after removing entries with keys that are multiples of 4 is: " + resultSize);


        scanner.close();
    }
}

