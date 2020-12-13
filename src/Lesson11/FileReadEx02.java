package Lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx02 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("D:/Temp/out1.txt")); //BufferedReader
	     while(true) {
	    	 String line = br.readLine();		//readLine() ¸Å¼Òµå
	         if (line==null) break;
	         System.out.println(line);
	     }
	     br.close();
	}
}