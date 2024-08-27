package list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleOnLinkedList2 {
	public static void main(String[] args) {
  LinkedList<String> al = new LinkedList<String>();
   //add some fruits into arraylist
   al.add("apple");
   al.add("banana");
   al.add("kiwi");
   al.add("mangos");
   al.add("grapes");
   al.add("apple");
   al.addFirst("pear");
   al.addLast("pineapple");
   System.out.println(al);
   al.removeFirst();
   al.removeLast();
   System.out.println(al);
   //adding elements at specific position using add(int,value)
   al.add(3,"orange");
   System.out.println("after adding element at specific position at 3");
   System.out.println(al);
   //replacing the element at specific position using set(int,replacevalue)
   al.set(5,"avacado");
   System.out.println("after replacing an elements at specific position");
   System.out.println(al);
    //search an element in the arraylist  using boolean contains()
     //search for an element kiwi
   boolean b=al.contains("kiwi");
   System.out.println("Element is found or not : "+b);
   //search for an element kiwi
   boolean b1=al.contains("dragon");
   System.out.println("Element is found or not : "+b1);
   //remove an element from the collection class
   // boolean remove(Object) or Object remove(int index)
   //boolean =al.remove("kiwi");
    String rm =al.remove(2);
    System.out.println("removed element at specific position at 2 is "+rm);
    System.out.println("After remove");
    System.out.println(al);
    
    System.out.println("Display the elements using iterator");
   Iterator<String> st =al.iterator();
    while(st.hasNext()) {
    	System.out.println(st.next()); //actual string object will return
    }  
    
   System.out.println("Display the elements using enhanced for loop ");
   for(String s :al) {
	   System.out.println(s);
   }
    System.out.println(" ");
    System.out.println("Display the elements using java8 foreach loop");
    al.forEach(e -> System.out.println(e)); //lamda expression
    System.out.println(" ");
    al.forEach(System.out::println); //methodReference		
	}

}
