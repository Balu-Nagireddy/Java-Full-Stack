package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestOnTransientSerialize {
	
	public static void main(String[] args) throws IOException {
		//createing the object
		ExampleOnSerTransient eot = new ExampleOnSerTransient();		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sainath\\Desktop\\data\\filetran.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(eot);//converting object into filetran.ser
		oos.close();
		fos.close();	
	}

}