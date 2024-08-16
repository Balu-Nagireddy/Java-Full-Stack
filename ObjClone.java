package assignment;
public class ObjClone implements Cloneable {
    int value;

    // Constructor
    public ObjClone(int value) {
		super();
		this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	public static void main(String[] args) {
        try {
            // Creating an object
            ObjClone obj1 = new ObjClone(10);

            // Cloning the object
            ObjClone obj2 = (ObjClone) obj1.clone();
            System.out.println("Original Value: " + obj1.value);
            System.out.println("Cloned Value: " + obj2.value);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}