package Lesson04;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {		  
	   int num1=20,num2=20,result; 
	   char op;
	   Scanner kb = new Scanner(System.in); 
	   System.out.print("Enter operator(+,-,*,/): "); 
	   op = kb.next().charAt(0);
	   switch(op){
	   case '+': 
	        result=num1+num2;
	        System.out.printf("%d + %d = %d",num1,num2,result);  
	        break;	      
	   case '-': 
		   result=num1-num2;
		   System.out.printf("%d - %d = %d",num1,num2,result);  
	        break;	      
	   case '*': 
		   result=num1*num2;
		   System.out.printf("%d * %d = %d",num1,num2,result);   
	        break;	      
	   case '/': 
		   result=num1/num2;
		   System.out.printf("%d / %d = %d",num1,num2,result); 
	        break;	      
	   default:System.out.println("Worong Input");  
	   }
	}
}