package labs;
import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String : ");
        String A = scanner.nextLine();
        System.out.println("Enter Second String : ");
        String B = scanner.nextLine();
        scanner.close();
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}

