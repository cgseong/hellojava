package Lesson11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileIOEx03 {

	public static void main(String[] args) throws IOException {
		double sales;
		
		Scanner salesFile = new Scanner(new File("D:/Temp/sales.txt"));
		
		while (salesFile.hasNext()) { 
			sales = salesFile.nextDouble();
			System.out.printf("$%,.2f\n", sales);
		}
		salesFile.close();
	}
}