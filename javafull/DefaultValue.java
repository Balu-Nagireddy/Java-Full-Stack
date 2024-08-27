package javafull;

public class DefaultValue {
	// instance variable declaration
	int a;
	float pi;
	double empSalary;
	boolean b;
	String s;
	public static void main(String[] args) {
		DefaultValue obj = new DefaultValue();
		System.out.println(obj.a);//0
		System.out.println(obj.pi);//0.0
		System.out.println(obj.empSalary);
	}

}
