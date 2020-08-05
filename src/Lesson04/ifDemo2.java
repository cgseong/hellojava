package Lesson04;

import java.util.Scanner;

public class ifDemo2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); 
		int number;  
		System.out.print("Enter number: "); 
		number = kb.nextInt();	
			
		if(number > 0){
			System.out.println(number+" is a positive number");
	       }
		else if(number < 0) {
			System.out.println(number+" is a negative number");
		}
	     else {
			System.out.println(number+" is a Zero");
		}
	}
}