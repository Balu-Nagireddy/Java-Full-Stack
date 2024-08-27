package javafull;
public class ConstructorEx {
	//instance variables
	int id;
	String name;
	static float pi = 3.142f;
	public ConstructorEx() {
		System.out.println("We are in default constructor");
	}
	public ConstructorEx(int id, String name) {
		this.id=id;
		this.name=name;		
	}
	public void display() {
		System.out.println("Details are : ");
		System.out.println(this.id+" "+this.name);
	}
	public static void main(String[] args) {
		// Creating the object using default constructor
		ConstructorEx obj = new ConstructorEx();
		obj.display();
		// Creating the object using Parameterized constructor
		ConstructorEx obj1 = new ConstructorEx(1,"Balu");
		obj1.display();
		ConstructorEx obj2 = new ConstructorEx();
		obj2.display();
		System.out.println("The value of Static Variable is : ");
		System.out.println(ConstructorEx.pi);
	}

}
