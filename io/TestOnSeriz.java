package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestOnSeriz {
	
	public static void main(String[] args) throws IOException {
		//createing the object
		ExampleOnSerialization eos = new ExampleOnSerialization();
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sainath\\Desktop\\data\\file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(eos);//converting object into file.ser
		
		oos.close();
		fos.close();
		
		
		
	}

}
