package Lesson11;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadEx01 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Temp\\test.txt");
		FileReader fr = new FileReader(file);
		int ch = 0; 
		while((ch = fr.read()) != -1) { 
			System.out.print((char)ch); 
		}
		fr.close();
	}
}
