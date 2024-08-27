package sets;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class ExampleOnLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet<String> hs = new LinkedHashSet<String>();
	
	hs.add("banana");
	hs.add("apple");
	hs.add("pineapple");
	hs.add("kiwi");
	hs.add("dragaon");
	hs.add("apple");
	hs.add(null);
	 System.out.println("No of objects :  "+hs.size());
	 System.out.println(hs);
	 
	hs.remove("kiwi");
	System.out.println("After remove : "+hs);
	
	
	
}
}