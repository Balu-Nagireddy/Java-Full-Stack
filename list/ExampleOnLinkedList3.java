package list;
import java.util.LinkedList;
import java.util.ListIterator;

public class ExampleOnLinkedList3 {
	
	public static void main(String[] args) {
	//<T> :-In Generic we need to use Wrapper classes not primitive types	
	LinkedList<Integer> al  = new LinkedList<Integer>();
	al.add(30);
	al.add(49);
	al.add(5);
	al.add(30);
	al.add(10);
	System.out.println(al);
	al.addFirst(50);
	al.addLast(40);
	System.out.println(al);

	ListIterator<Integer> iobj = al.listIterator();
	System.out.println("Elements displaying in forward direction or insertion order");
	while(iobj.hasNext()) {
		System.out.println(iobj.next());
	}
	
	System.out.println("Elements displaying in backward direction ");
	while(iobj.hasPrevious()) {
		System.out.println(iobj.previous());
	}  
	
	}

}
