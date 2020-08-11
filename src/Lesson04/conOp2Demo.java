package Lesson04;

import java.util.Scanner;

public class conOp2Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); 
		
		System.out.print("Enter ID : "); 
		String uid = kb.next();
		
		System.out.print("Enter Password : ");
        String pwd = kb.next();
        
        if(uid.equals("abc1234") && pwd.equals("1234")) {
        	System.out.println("LOGIN SUCCESS");
        } else {
            System.out.println("LOGIN FAILURE");
        }
	}
}
