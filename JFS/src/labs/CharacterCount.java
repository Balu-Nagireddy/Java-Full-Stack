package labs;
import java.util.Scanner;

public class CharacterCount {

    public static int[] countCharacters(char[] characters) {
        int[] counts = new int[128];
        for (char c : characters) {
            counts[c]++;
        }
        return counts;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] characters = input.toCharArray();
        int[] counts = countCharacters(characters);
        System.out.println("Character counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }

        sc.close();
    }
}

