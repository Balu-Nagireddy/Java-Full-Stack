package sets;
import java.util.TreeSet;

public class ExampleOnTreeSet2 {
  public static void main(String[] args) {
	
	  TreeSet<Customer> ts = new TreeSet<Customer>(new MyComparator());
	  Customer c1 = new Customer(31,"martin","dallas");
	  Customer c2 = new Customer(23,"smith","newyork");
	  Customer c3 = new Customer(10,"allen","newjersery");
	  
	  ts.add(c3);
	  ts.add(c1);
	  ts.add(c2);
	  
	  System.out.println("Displaying the objects from TreeSet");
	  for(Customer c: ts) {
		 System.out.println(c.getId()+" "+c.getName()+" "+c.getAddrs()); 
	  }
	  
	  
	  
}
}
