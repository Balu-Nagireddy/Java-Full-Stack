package assignment.practical2;

class UserMainCode5 {
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}

public class Main4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        scanner.close();

        int result = UserMainCode5.reverseNumber(number);
        System.out.println("The reversed number is : ");
        System.out.println(result);
    }
}

