package Lesson04;

import java.util.Scanner;
public class IfDemo1 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in); 
		int number;  
 		System.out.print("Enter number: "); 
 		number = kb.nextInt();	
 		
		if(number > 0)
        {
			System.out.println(number+" is a positive number");
        }
		else {
			System.out.println(number+" is a negative number or Zero");
		}
	}
}