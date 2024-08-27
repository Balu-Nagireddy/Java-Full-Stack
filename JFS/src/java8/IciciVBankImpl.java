package java8;

public class IciciVBankImpl {
	
	public Employee display() {
		
		return new Employee(1001, "Smith", 4000);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IciciVBankImpl i = new IciciVBankImpl();
		IciciBank ic = i::display;
		Employee e = ic.getDetails();
		System.out.println("Employee Details are : ");
		System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSal());
	}

}
