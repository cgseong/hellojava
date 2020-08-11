package Lesson05;

import java.util.Scanner;

public class breakDemo {

	public static void main(String[] args) {
		int number, sum = 0;
		
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            number = kb.nextInt();         
           
            if (number == 0) {
                break;
            }
         
            sum += number;		//sum=sum+number
        }
	   
        System.out.println("Sum = " + sum);
	}

}
