package io;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnBufferedWriter {
	
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\sainath\\Desktop\\data\\temp.txt");
		
		BufferedWriter bw= new BufferedWriter(f);
		bw.write("hello");
		bw.newLine();
		bw.write(100);
		
		
		bw.close();
		
	}

}
