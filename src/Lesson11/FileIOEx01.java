package Lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIOEx01 {

	public static void main(String[] args) throws FileNotFoundException {
		String name1, name2, name3;
		Scanner myFile = new Scanner(new File("D:/Temp/out1.txt"));
		
		name1 = myFile.nextLine(); 
		name2 = myFile.nextLine(); 
		name3 = myFile.nextLine();
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		myFile.close();
	}
}