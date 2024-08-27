package sets;

import java.util.Comparator;
import java.util.TreeSet;

public class Exercise3 {
	public static void main(String[] args) {
      Comparator<Employee> cpt=(o1,o2)->o1.getSal()<o2.getSal()?1:o1.getSal()>o2.getSal()?-1:0;
	
		TreeSet<Employee> ts = new TreeSet<Employee>(cpt);
		
		Employee e1 = new  Employee(23,"smith",4000);
		Employee e2 = new  Employee(10,"martin",5000);
		Employee e3 = new  Employee(40,"allen",8000);
		Employee e4 = new  Employee(21,"scott",1000);
		Employee e5 = new  Employee(23,"smith",4000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println(ts);
		System.out.println("Display object from the TreeSet Exercise 2");
		for(Employee e:ts) {
			System.out.println(e.getEmpId()+","+e.getEname()+","+e.getSal());
		}
		
	}
}