package java8;

public class FirstImpl {
	
	public static void main(String[] args) {
		
		First fobj =(s)->{return "hello" +s;};
		
		String msg =fobj.sayHello("Ramesh");
		System.out.println(msg);
		
	}

}
