package java8;

public class MyTestImpl {
	//Pre-Existing Instance Method
	public String m1(String m) {
		
		return "Hello "+m;
	}
	//Pre-Existing Static Method
	public static String m2(String m) {
			
		return "Hello "+m;
	}
	public static void main(String[] args) { 
		MyTestImpl t1 = new MyTestImpl();
		// Normal Implementation for SAM lambda Expression using return Statement
		MyTest obj = (x)->{return  "Welcome "+x;};
		// Normal Implementation for SAM lambda Expression
		MyTest obj1 = (x)->"Welcome "+x;
		// Method Reference to Instance Method
		MyTest o = t1::m1;
		// Method Reference to Static Method 
		MyTest s = MyTestImpl::m2;
		System.out.println(o.sayHello("Amy"));
		System.out.println(obj.sayHello("Ravi"));
		System.out.println(obj1.sayHello("Balu"));
		System.out.println(s.sayHello("Eswar"));
	}

}
