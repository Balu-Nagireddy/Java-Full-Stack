package sets;

import java.util.HashSet;

public class ExampleOnSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Product> hs = new HashSet<Product>(); 
		Product p = new Product(1001,"Mouse",500);
		Product p1 = new Product(100,"Mobile",15000);
		Product p2 = new Product(1004,"Laptop",50000);
		Product p3 = new Product(2008,"TV",25000);
		Product p4 = new Product(1001,"Mouse",500);
		hs.add(p);
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		System.out.println("Displaying the object from Hashset using enhanced for loop ");
		for(Product pobj : hs) {
			System.out.println(pobj.getProductId()+" "+pobj.getProductName()+" "+pobj.getPrice());
		}
		System.out.println("p address is : "+p.hashCode());
		System.out.println("p4 address is : "+p4.hashCode());
	}

}
