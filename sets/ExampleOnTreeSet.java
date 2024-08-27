package sets;
import java.util.TreeSet;

public class ExampleOnTreeSet {
   public static void main(String[] args) {
	
	   TreeSet<Integer> ts = new TreeSet<Integer>();
	   
	   //adding elements in treeSet
	   ts.add(100);
	   ts.add(40);
	   ts.add(30);
	   ts.add(120);
	   ts.add(9);
	   ts.add(13);
	   ts.add(30);
	   ts.add(1);
	   //ts.add(null); not valid

	  System.out.println("No of elements : "+ts.size());
	  System.out.println("Asceding order : ");
	  System.out.println(ts);
	  
	  
	  
}
}
