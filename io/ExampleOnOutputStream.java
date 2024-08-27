package io;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleOnOutputStream {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fop = new FileOutputStream("C:\\Users\\sainath\\Desktop\\data\\output.txt");
		
		fop.write(100);
         byte b[] = {'h','e','l','l','o'};
         fop.write('\n');
		fop.write(b);
		fop.flush();
		fop.close();
		
		
		
	}

}
