package javafull;

public class Chair {
	//Chair object properties are color,material,noOfWheels
	//instance variable
	String color = "white";
	String material = " Plastic";
	int noOfWheels = 4;
	
	//chair object behaviour or actions chairMovieable()
	//seatHeightAdjastable()
	//instance method
	
	public void chairMovieable() {
		System.out.println("Chair is Movieable");
	}
	public void seatHeightAdjastable() {
		System.out.println("We can adjust the height of the chair");
	}
	public static void main(String[] args) {
		//to use chair object properties and behaviour we need to create the object
		//for a class
		//Sysntax :
		// ClassName referenceName = new ClassName();
		Chair obj1 = new Chair();
		
		//accessing the chair properties
		System.out.println("Chair Properties are : ");
		System.out.println(obj1.color + obj1.material + obj1.noOfWheels);
		//Accessing Methods
		obj1.chairMovieable();
		obj1.seatHeightAdjastable();
	}
}
