package assignment;
public class ObjFactory {
    int value;
    //Constructor
    public ObjFactory(int value) {
		super();
		this.value = value;
	}
	// Factory method
    public static ObjFactory createInstance(int value) {
        return new ObjFactory(value);
    }
    public static void main(String[] args) {
        // Using the factory method to create an object
        ObjFactory obj = ObjFactory.createInstance(10);
        System.out.println("Value: " + obj.value);
    }
}


