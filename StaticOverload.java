package assignment;
public class StaticOverload {

    // First static method with no parameters
    public static void display() {
        System.out.println("Static method with no parameters.");
    }

    // Overloaded static method with one integer parameter
    public static void display(int num) {
        System.out.println("Static method with int parameter: " + num);
    }

    // Overloaded static method with one String parameter
    public static void display(String message) {
        System.out.println("Static method with String parameter: " + message);
    }

    // Overloaded static method with two parameters: int and String
    public static void display(int num, String message) {
        System.out.println("Static method with int and String parameters: " + num + ", " + message);
    }

    public static void main(String[] args) {
        // Calling overloaded static methods
        display();                          // Calls the method with no parameters
        display(10);                        // Calls the method with an int parameter
        display("Hello, world!");           // Calls the method with a String parameter
        display(5, "Overloading example");  // Calls the method with int and String parameters
    }
}

