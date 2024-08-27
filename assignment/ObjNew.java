package assignment;
public class ObjNew {
    String name;
    public ObjNew(String name) {
		super();
		this.name = name;
	}
	// Method to display the name
    public void display() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        // Creating an object using the new operator
        ObjNew person = new ObjNew("Balu");
        person.display(); // Output: Name: Alice
    }
}




