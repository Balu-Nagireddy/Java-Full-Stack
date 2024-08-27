
package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ExampleOnArrayList4 {
	public static void main(String[] args) {
		//in arraylist we are storing Product javabean class
		ArrayList<Product> al = new ArrayList<Product>();
		//
		Product p = new Product();//default constructor
		p.setProductId(101);
		p.setProductName("mouse");
        p.setPrice(300);
        //
        Product p2 = new Product(1021,"keyboard",800);
        //adding the Product objects to ArrayList
        al.add(p);
        al.add(p2);
        al.add(new Product(1032,"monitor",5000));
        
        System.out.println("No of elements in array list is : "+al.size());
        System.out.println(al);   
        
        System.out.println("Display the elements(product objects) using iterator");
        System.out.println("Product Details are :");
        Iterator<Product> iobj = al.iterator();
        while(iobj.hasNext()) {
        	//System.out.println(iobj.next());
			  Product pobj =iobj.next();
			  System.out.println("Product Id is : "+pobj.getProductId());
			  System.out.println("Product Name is : "+pobj.getProductName());
			  System.out.println("Product Price is : "+pobj.getPrice());
			  System.out.println("");
			 
        }  
        
        System.out.println("Display the elements(product objects) using enhanced forloop");
        System.out.println("Product Details are :");
        for(Product pobj1:al) {
        	 System.out.println("Product Id is : "+pobj1.getProductId());
			  System.out.println("Product Name is : "+pobj1.getProductName());
			  System.out.println("Product Price is : "+pobj1.getPrice());
			  System.out.println("");
        }
        
        System.out.println("Display the elements using java8forEach loop");
        System.out.println("Product Details are :");
        al.forEach(e ->System.out.println(e.getProductId()+" "+e.getProductName()+" "+e.getPrice()));
        Collections.sort(al, Comparator.comparingDouble(Product::getPrice));
           
		/*
		 * Collections.sort(al, new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { return
		 * Double.compare(p1.getPrice(), p2.getPrice()); } });
		 */

        System.out.println("\nAfter sorting by price:");
        al.forEach(e -> System.out.println(e.getProductId() + " " + e.getProductName() + " " + e.getPrice()));
    }
		
}

