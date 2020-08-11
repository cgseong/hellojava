package Lesson05;

import java.util.Scanner;

public class dowhileDemo {

	public static void main(String[] args) {
		int number, sum = 0;
		
        Scanner kb = new Scanner(System.in);

        do {            
            System.out.print("Enter a number: ");
            number = kb.nextInt();
            sum += number;
        } while (number != 0);
	   
        System.out.println("Sum = " + sum);
	}
}
