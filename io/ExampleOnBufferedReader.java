package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleOnBufferedReader {
	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("C:\\Users\\sainath\\Desktop\\data\\tempData.txt");
		
		BufferedReader br = new BufferedReader(f);
		
		String line =br.readLine();
		System.out.println("Reading the data from file using buffered Reader");
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		
	}

}
