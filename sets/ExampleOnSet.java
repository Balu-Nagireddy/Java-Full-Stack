package sets;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnSet {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	
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
	//search a object in hashSet
	boolean b=hs.contains("kiwi");
	System.out.println("element fount or not fount?: "+b);
	
	System.out.println("using iterarot");
	Iterator<String> iobj =hs.iterator();
	while(iobj.hasNext()) {
	System.out.println(iobj.next());
	}
	
	System.out.println("using enhanced for loop");
	for(String s: hs) {
		System.out.println(s);
	}
	
	
	
}
}
