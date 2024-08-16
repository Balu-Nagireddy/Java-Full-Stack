package javafull;

public class Overloading {
	public void addition(int a,int b) {  //addition(int , int)
		int c=a+b;
		System.out.println("sum of two numbers is:"+c);
	}
	public int addition(int a,int b,int c) { //addition(int , int , int)
		return a+b+c;
		
	}
	public double addition(double a,double b) {  //addition(double , double)
		return a+b;
	}

	public static void main(String[] args) {
        Overloading mov=new Overloading();
        mov.addition(10,20);
        double res=mov.addition(20.0,15.0);
        System.out.println("Method Overloading Double "+res);
	}

}
