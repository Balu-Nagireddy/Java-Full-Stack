package assignment;

public class UseCase1 implements I2{
	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "Welcome "+m;
	}

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("We are in display method");
	}
	public static void main(String[] args) {
		UseCase1 uc1 = new UseCase1();
		uc1.display();
		int sum = uc1.addition(10, 50, 40);
		System.out.println("Sum of 3 numbers : "+sum);
		System.out.println(uc1.sayHello("Balu"));
		System.out.println("-------------------------------------");
		
		//2nd way
		I2 iobj = new UseCase1();
		System.out.println("Sum is : "+iobj.addition(10, 35, 5));
		System.out.println(iobj.sayHello("Balu"));
		
	}

}
