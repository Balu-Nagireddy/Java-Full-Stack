package labs;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		int a;
		Difference obj = new Difference();
		a=obj.calculateDifference();
		System.out.println("Difference between the Sum of Squares upto n and Square of the Sum upto n is : "+a);

	}
	public int calculateDifference() {
		int deff,i,sqsum=0,tsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(i=1;i<=n;i++) {
			sqsum=sqsum+(i*i);
			tsum=tsum+i;
		}
		System.out.println(sqsum+" "+tsum);
		tsum=tsum*tsum;
		System.out.println(tsum);
		deff= sqsum-tsum;
		return deff;
	}

	
}
