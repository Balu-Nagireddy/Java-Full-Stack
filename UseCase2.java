package assignment;

public class UseCase2 implements MyInt1,MyInt2 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("We are in Method M2");
	}

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("We are in Method M1");
	}

	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "Welcome "+m ;
	}
	public static void main(String[] args) {
		UseCase2 uc = new UseCase2();
		uc.m1();
		uc.m2();
		System.out.println("Sum is : "+uc.addition(10, 30, 10));
		System.out.println(uc.sayHello("Balu"));
	}
	

}
