package Lesson11;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadEx01 {

	public static void main(String[] args) throws IOException {
		 byte[] b = new byte[1024];
	     FileInputStream input = new FileInputStream("D:/Temp/out1.txt");
	     input.read(b);
	     System.out.println(new String(b));
	     input.close();
	}
}