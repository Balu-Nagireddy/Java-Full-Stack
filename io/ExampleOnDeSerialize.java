package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExampleOnDeSerialize {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileInputStream foi = new FileInputStream("C:\\Users\\sainath\\Desktop\\data\\file.ser");
		ObjectInputStream ois = new ObjectInputStream(foi);
		Object obj =ois.readObject();
		
		ExampleOnSerialization eos = (ExampleOnSerialization) obj;
		System.out.println("variables are : ");
		System.out.println(eos.a);
		System.out.println(eos.b);
		eos.methodOne();
		
	}
}
