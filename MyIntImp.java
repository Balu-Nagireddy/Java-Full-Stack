package assignment;
public abstract class MyIntImp implements MyInt {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("We are in Method 1");
	}
	@Override
	public String sayHello(String m) {
		// TODO Auto-generated method stub
		return "Welcome to Abstract "+m;
	}
}
