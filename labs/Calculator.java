package labs;
import java.util.Scanner;
public class Calculator implements AdvancedArithmetic {
	int i,sum=0;
	static int n;
	@Override
	public int divisorSum(int n) {
		for(i=1;i<n+1;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public void display() {
		System.out.println("The Sum of the divisors of the number "+n+" is : "+this.sum);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Enter The number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c.divisorSum(n);
		c.display();
	}

}
