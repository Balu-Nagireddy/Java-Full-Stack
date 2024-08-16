package javafull;

public class ExOnVar {
	// instance variable
	int empId=1;
	String empName="Balu";
	double empSal= 4000;
	
	static String companyCode = "PEC";
	
	//instance method
	public void display() {
		int bonus;//local var is declared 
		bonus = 3000;
		System.out.println("Local Variable is : "+bonus);
	}
	
	public static void m1() {
		System.out.println("We are in method 1");
	}
	public static void main(String[] args) {
		ExOnVar e = new ExOnVar();
		System.out.println("Employee Details are : ");
		System.out.println(e.empId +" "+ e.empName+" "+e.empSal);
		System.out.println(" Calling Static variable companyCode ");
		System.out.println(e.companyCode);//not recommended
		System.out.println(" Calling Static variable companyCode in static way (class name) ");
		System.out.println(ExOnVar.companyCode);
		// Calling Instance Method
		e.display();
		// Calling Static Method
		e.m1();
		ExOnVar.m1();
	}

}
