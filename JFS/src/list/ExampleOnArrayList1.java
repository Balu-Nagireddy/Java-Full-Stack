package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnArrayList1 {

	public static void main(String[] args) {
		//heterogenious element to add in ArrayList
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("rahul"); //String
		al.add(10);//int -->it will convert into wrapper class object -->Integer
		al.add(true);//boolean -->Boolean
		al.add(10.0f);//float -->Float
		al.add('c');//char -->Character
		al.add(40.0);//double ->Double
		al.add(10);//duplicated allowed
		
		System.out.println("No of Objects or elements : "+al.size());
		System.out.println("Insertion order is preserved ");
		System.out.println(al);
		
		System.out.println("Displaying elements using iterator");
		
		//get the iterator
		Iterator<Object> iobj =al.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
	}
	
	
}