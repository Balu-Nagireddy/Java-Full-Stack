package java8;

public class D implements XYZ{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "welcome to java 8 ";
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("we are in m1 method of D class");
	}
	
	@Override
	public int addition(int a,int b) {
		int c =30;
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		D a = new D();
		System.out.println(a.sayHello());
		a.m1();
		System.out.println(a.addition(30, 10));
		XYZ.methodTwo();
		
		
	}

}
