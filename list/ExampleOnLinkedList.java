package list;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ExampleOnLinkedList {
    public static void main(String[] args) {
        // in LinkedList we are storing Product javabean class
        LinkedList<Product> ll = new LinkedList<Product>();
        
        Product p = new Product(); // default constructor
        p.setProductId(101);
        p.setProductName("mouse");
        p.setPrice(300);
        
        Product p2 = new Product(1021, "keyboard", 800);
        // adding the Product objects to LinkedList
        ll.add(p);
        ll.add(p2);
        ll.add(new Product(1032, "monitor", 5000));
        
        System.out.println("No of elements in linked list is : " + ll.size());
        System.out.println(ll);
        
        System.out.println("Display the elements (product objects) using iterator");
        System.out.println("Product Details are :");
        Iterator<Product> iobj = ll.iterator();
        while (iobj.hasNext()) {
            Product pobj = iobj.next();
            System.out.println("Product Id is : " + pobj.getProductId());
            System.out.println("Product Name is : " + pobj.getProductName());
            System.out.println("Product Price is : " + pobj.getPrice());
            System.out.println("");
        }  
        
        System.out.println("Display the elements (product objects) using enhanced for loop");
        System.out.println("Product Details are :");
        for (Product pobj1 : ll) {
            System.out.println("Product Id is : " + pobj1.getProductId());
            System.out.println("Product Name is : " + pobj1.getProductName());
            System.out.println("Product Price is : " + pobj1.getPrice());
            System.out.println("");
        }
        
        System.out.println("Display the elements using java forEach loop");
        System.out.println("Product Details are :");
        ll.forEach(e -> System.out.println(e.getProductId() + " " + e.getProductName() + " " + e.getPrice()));
        Collections.sort(ll, Comparator.comparingDouble(Product::getPrice).reversed());
           
        System.out.println("\nAfter sorting by price:");
        ll.forEach(e -> System.out.println(e.getProductId() + " " + e.getProductName() + " " + e.getPrice()));
    }
}

