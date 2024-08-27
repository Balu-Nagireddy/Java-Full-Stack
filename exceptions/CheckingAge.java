package exceptions;
import java.util.Scanner;

import labs.ValidateAgeException;
public class CheckingAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		try {
			if(age<18) {
				//throw keyword is used to throw the user-defined exceptions...
				throw new ValidateAgeException("Age should be greaterthan or Equals to 18 to cast the VOTE....");
			}
			else {
				System.out.println("Valid Age ");
			}
		}
		catch(ValidateAgeException vg){
			System.err.println(vg.getMessage());
		}
		
	}

}
