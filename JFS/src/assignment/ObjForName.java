package assignment;

import java.lang.reflect.InvocationTargetException;

public class ObjForName {
	String name;
	public ObjForName(String name) {
		super();
		this.name = name;
	}
	public void display() {
		System.out.println("The Name is : "+this.name);
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Class t= Class.forName("assignment.ObjForName");
		Object o = t.getConstructor(String.class).newInstance("Balu");
		ObjForName ofn = (ObjForName) o;
		ofn.display();

	}

}
