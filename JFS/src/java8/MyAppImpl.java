package java8;

public class MyAppImpl {

	public static void main(String[] args) {
		
		 MyApp appObj =()->System.out.println("welcome to java8 lambda exression");
		
		 //calling the lambda expression
		 appObj.showMsg();
	} 
}
