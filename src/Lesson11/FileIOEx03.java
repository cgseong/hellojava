package Lesson11;

import java.io.*;
import java.util.Scanner;

public class FileIOEx03 {

	public static void main(String[] args) throws IOException {
		double sales;
		
		Scanner salesFile = new Scanner(new File("C:/Temp/sales.txt"));
		
		while (salesFile.hasNext()) { 
			sales = salesFile.nextDouble();
			System.out.println(sales);
		}
		salesFile.close();
	}
}
