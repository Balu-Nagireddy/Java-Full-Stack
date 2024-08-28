package assignment.practical2;

class UserMainCode4 {
    public static String formNewWord(String s, int n) {
        return s.substring(0, n) + s.substring(s.length() - n);
    }
}
public class Main1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the String : ");
        String inputString = scanner.nextLine();
        System.out.println("Enter the n value : ");
        int n = scanner.nextInt();
        scanner.close();
        String result = UserMainCode4.formNewWord(inputString, n);
        System.out.println(result);
    }
}
