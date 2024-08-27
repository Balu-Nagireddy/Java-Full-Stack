package labs;
import java.util.Scanner;
public class ArraySort{
	static int a[];
	int n;
	int i;
	public void array() {
		System.out.println("Enter the Size of the Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a=new int[n];
		System.out.println("Enter the elements into the Array : ");
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
	}
	public void display() {
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public void sort(int array[]) {
	    if (array == null || array.length < 2) {
	        throw new IllegalArgumentException("Array must have at least two elements.");
	    }
	    for (int i = 0; i < array.length - 1; i++) {
	        for (int j = i + 1; j < array.length; j++) {
	            if (array[i] > array[j]) {
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	                
	            }
	        }
	    }
	}
	public int getSecondSmallest(int[] array) {
	    return array[1];
	}
	public static void main(String[] args) {
		ArraySort as = new ArraySort();
		as.array();
		System.out.println("The Entered array is : ");
		as.display();
		as.sort(a);
		System.out.println("\nThe Array After Sorting : ");
		as.display();
		int s =as.getSecondSmallest(a);
		System.out.println("\nThe Second Smallest number in the Array is : "+s);
	}
}
