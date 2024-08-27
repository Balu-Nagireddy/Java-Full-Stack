package labs;
import java.util.Scanner;
public class Operators {
	int d,sum=0;
	int cubesum(int n) {
		int i=n;
		while(i>0){
			d=i%10;
			sum=sum+(d*d*d);
			i=i/10;
		}
		return sum;
	}
	public void display() {
		System.out.println("The Sum of the Cubes of the digits of the number is : "+this.sum);
	}
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Operators o = new Operators();
		o.cubesum(n);
		o.display();
	}
}
