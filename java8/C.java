package java8;

public class C implements XYZ{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "welcome to java 8 ";
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("we are in m1 method of C class");
	}
	public static void main(String[] args) {
		C a = new C();
		System.out.println(a.sayHello());
		a.m1();
		System.out.println(a.addition(40, 50));
		XYZ.methodTwo();
		
		
	}

}