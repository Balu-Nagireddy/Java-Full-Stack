package labs;
import java.util.Scanner;
public class Fibonacci {
	static int n;
	static int n1=0;
	static int n2=1;
	static int n3;
	public static int reccursive(int n) {
        if (n <= 1) {
            return n;
        }
        return reccursive(n - 1) + reccursive(n - 2);
    }
	public void nonReccursive(int n) {
		int i=1;
		while(i<n) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Fibonacci fb = new Fibonacci();
		System.out.println("Fibonacci Series in Reccursive Manner : \n");
		System.out.println(n1+" "+n2+" ");
		System.out.println(fb.reccursive(n)+" ");
		System.out.println("Fibonacci Series in Non-Reccursive Manner : \n");
		System.out.println(n1+" "+n2+" ");
		fb.nonReccursive(n);
		
	}

}
