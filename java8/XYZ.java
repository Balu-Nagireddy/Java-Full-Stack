package java8;
public interface XYZ {
	
	public abstract String sayHello();
	public abstract void m1();
	//
	default int addition(int a,int b) {
		return a+b;
	}

	static void methodTwo() {
		System.out.println("we are in static method of methodTwo");
	}
	
}
