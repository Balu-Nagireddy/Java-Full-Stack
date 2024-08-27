package list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleOnLinkedList1 {
	
	public static void main(String[] args) {
		//List<T> reference Object =new LinkedList<T>();
	 List<Object> al = new LinkedList<Object>();  //Generic Object -> any type of data we can store
	 //to store elements or add into LinkedList we will use add()
	 al.add(10);   //10 -int-> Integer
	 al.add("hi"); //string
	 al.add(10.0f); //float -->Float
	 al.add(true);  //boolean -->Boolean
	 al.add('a');   //char  -->Character
	 al.add(104.00);
	 al.add(10);
	 
	 System.out.println("no of elements in arraylist is : "+al.size());
	 System.out.println(al);//insertion order is preserved
	 System.out.println("Displaying the elements using iterator");
	 
	 Iterator<Object> iobj =al.iterator();
	 while(iobj.hasNext()) {
		 System.out.println(iobj.next());
	 }	
}
}
