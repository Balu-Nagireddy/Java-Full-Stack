package exceptions;
import java.util.Scanner;
public class Name {
	public static void checkNames(String firstName, String secondName) throws ValidateNameException {
	    if (firstName == null || firstName.isEmpty()) {
	        throw new ValidateNameException("First name is not entered.");
	    }
	    if (secondName == null || secondName.isEmpty()) {
	        throw new ValidateNameException("Second name is not entered.");
	    }
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the second name: ");
        String secondName = scanner.nextLine();
        try {
            checkNames(firstName, secondName);
            System.out.println("Your Name is : "+firstName+" "+secondName);
        } 
        catch (ValidateNameException e) {
            System.err.println(e.getMessage());
        }
        scanner.close();
    }
}
