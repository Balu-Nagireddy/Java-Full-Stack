package javafull;

public class Casting {
	public static void main(String[] args) {
		int i=10;
		System.out.println("i Value us : "+i);
		
		double d = i;
		System.out.println("d Value us : "+d);
		
		char ch = 'a';
		System.out.println("ch Value us : "+ch);
		
		int chi = ch;
		System.out.println("chi Value us : "+chi);
		
		//Explicite
		double d1 = 100;
		System.out.println("d Value us : "+d);
		
		char ch2 = (char) d1;
		System.out.println("ch2 Value us : "+ch2);
		
		float f1 = 10.0f;
		System.out.println("f1 Value us : "+f1);
		
		long l = (long) f1;
		System.out.println("l Value us : "+l);
		
		String s="hello";
		System.out.println("S value is:"+s);
		
		Object o=s;
		
		System.out.println("after implicity cast is:"+o);
		
		String s2=(String)o;
		
	System.out.println("after type cast explicity is :"+2);
	
	
	}
}
