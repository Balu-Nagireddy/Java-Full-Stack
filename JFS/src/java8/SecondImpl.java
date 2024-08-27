package java8;

public class SecondImpl {
  public static void main(String[] args) {
	
	  Second sobj = (x,y,z)->x+y+z;
	  
	  int res = sobj.addition(30, 50, 60);
	  System.out.println("sum is : "+res);
	  
	  }
}
