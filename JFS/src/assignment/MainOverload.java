package assignment;

public class MainOverload {

    // Standard main method
    public static void main(String[] args) {
        System.out.println("Standard main method called.");
        
        // Calling overloaded main methods
        main(5);
        main("Hello, world!");
        main(3, 7);
    }

    // Overloaded main method with a single integer parameter
    public static void main(int num) {
        System.out.println("Overloaded main method with int parameter: " + num);
    }

    // Overloaded main method with a single String parameter
    public static void main(String message) {
        System.out.println("Overloaded main method with String parameter: " + message);
    }

    // Overloaded main method with two integer parameters
    public static void main(int num1, int num2) {
        System.out.println("Overloaded main method with two int parameters: " + num1 + ", " + num2);
    }
}

