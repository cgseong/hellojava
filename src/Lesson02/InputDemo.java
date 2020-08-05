package Lesson02;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); 
		String name; 
		double payRate, total; 
 		int hours;  
 		System.out.print("Enter your name: "); 
 		name = kb.nextLine();  
 		System.out.print("Enter your hourly pay rate: "); 
 		payRate = kb.nextDouble();  
 		System.out.print("Enter the number of hours worked: "); 
 		hours = kb.nextInt();		
		total = payRate * hours; 
 		System.out.println("Here are the values that you entered:"); 
 		System.out.println(name); 
 		System.out.println(payRate); 
 		System.out.println(hours); 
		System.out.println(total);
	}
}
