package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFileRead {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sainath\\Desktop\\data\\tempData.txt");
		//fileReader
		FileReader fr = new FileReader(f);
		int i =fr.read();
		System.out.println("Dispaying the data from the file");
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		
		
		
	}

}
