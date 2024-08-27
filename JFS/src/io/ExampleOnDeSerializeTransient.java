package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExampleOnDeSerializeTransient {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileInputStream foi = new FileInputStream("C:\\Users\\sainath\\Desktop\\data\\filetran.ser");
		ObjectInputStream ois = new ObjectInputStream(foi);
		Object obj =ois.readObject();
		
		ExampleOnSerTransient eos = (ExampleOnSerTransient) obj;
		System.out.println("variables are : ");
		System.out.println(eos.a);
		System.out.println(eos.b);
		eos.methodOne();
		
	}
}