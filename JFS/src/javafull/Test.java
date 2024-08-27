package javafull;

public class Test {
	public static void main(String[] args) {
		Address a1 = new Address("Hyd","Telangana",500532);
		Employee e = new Employee(1,"Balu",100000,a1);
		System.out.println("Employee Details : ");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpSal());
		Address eaddrs = e.getAddr();
		System.out.println(eaddrs.getCity());
		System.out.println(eaddrs.getState());
		System.out.println(eaddrs.getPincode());
	}
}
