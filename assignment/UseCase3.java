package assignment;

public class UseCase3 extends MyInt3 implements MyInt4 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("We are in Method 2");
	}

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "Haiii "+m;
	}
	public static void main(String[] args) {
		UseCase3 uc = new UseCase3();
		//Calling parent class method 
		System.out.println("Sum is : "+uc.addition(100, 20, 80));
		uc.m1();
		//Calling implementation method
		System.out.println(uc.sayHello("Balu"));
		uc.m2();
	}
}
