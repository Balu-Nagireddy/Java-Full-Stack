package labs;
import java.util.Scanner;
/**
 * 
 */
public class Sum {
	public static void main(String[] args) {
		int a;
		Sum obj = new Sum();
		a=obj.calculateSum();
		System.out.println("The sum of all the numbers which are divisible by 3 or 5 upto the given number is : "+a);
	}
	public int calculateSum() {
		int sum=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(i=1;i<n+1;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
