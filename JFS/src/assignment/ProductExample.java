package assignment;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private int pid;
    private String pname;
    private double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Product objects
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.0));
        products.add(new Product(2, "Smartphone", 800.0));
        products.add(new Product(3, "Tablet", 400.0));

        // Converting List of Products to Map<pname, price>
        Map<String, Double> productPriceMap = products.stream()
                .collect(Collectors.toMap(Product::getPname, Product::getPrice));

        // Printing the Map
        productPriceMap.forEach((pname, price) -> 
                System.out.println("Product Name: " + pname + ", Price: " + price));
    }
}
