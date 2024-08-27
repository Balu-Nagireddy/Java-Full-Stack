package list;
import java.util.ArrayList;
import java.util.List;

public class ExampleOnArrayList3 {
	
	public static void main(String[] args) {
	//<T> :-In Generic we need to use Wrapper classes not primitive types	
	List<Integer> al  = new ArrayList<Integer>();
	al.add(30);
	al.add(49);
	al.add(5);
	al.add(30);
	al.add(10);
	System.out.println(al);
    //sort the elements in ascending order
	al.sort((i1,i2) -> i1.compareTo(i2)); //lambda expression
	System.out.println("asceding order");
	System.out.println(al);
	 //sort the elements in descding order
		al.sort((i1,i2) -> i2.compareTo(i1)); //lambda expression
		System.out.println("desceding order");
		System.out.println(al);
	}

}
