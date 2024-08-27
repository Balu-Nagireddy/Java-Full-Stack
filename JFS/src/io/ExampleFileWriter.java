package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sainath\\Desktop\\data\\simple.txt");
		
		FileWriter fs = new FileWriter(f);
		fs.write("hello");
		fs.write("\n");
		fs.write(100);
		fs.write("\\n");
		char  ch[] = {'s','e','d','r'};
		fs.write(ch);
		fs.flush();
		fs.close();
		
	}

}