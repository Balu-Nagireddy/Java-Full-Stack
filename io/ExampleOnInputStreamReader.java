package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleOnInputStreamReader {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fos = new FileInputStream("C:\\\\Users\\\\sainath\\\\Desktop\\\\data\\\\tempData.txt");
		
		int i =fos.read();
		System.out.println("Reading the data from the file using inputstream");
		
		while(i!= -1) {
			System.out.print((char)i);
			i=fos.read();
					
		}
		
	}

}
