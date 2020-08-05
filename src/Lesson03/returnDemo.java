package Lesson03;

import java.util.Scanner;

public class returnDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);	
		int number;	
		System.out.println("Enter Integer Number"); 				
		number = keyboard.nextInt();		
		int retvalue=doubleNumber(number);
		System.out.println("that number doubled."); 
		System.out.println(retvalue);
	} 	
	public static int doubleNumber(int value) 
	{ 	
		int result = value * 2;		
		return result;	//value * 2
	}
}