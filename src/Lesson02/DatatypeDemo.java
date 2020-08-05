package Lesson02;

public class DatatypeDemo {

	public static void main(String[] args) {
		int varInt1 = 2147483647; 
		System.out.println(varInt1);
		
		int varInt2 = -2147483648; 
		System.out.println(varInt2);
		
		boolean b=false;
		System.out.println(b);
		
		String str1 = "Hello World";
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));
		String str2 = "Hello World!";
		System.out.println(str1.equals( str2 ));
		System.out.println(str1.indexOf( 'o' ));
		System.out.println(str1.substring(6));
		
		char ch ='a';
		System.out.println((int)ch);
		
		int x=(int)127.5;
		System.out.println(x);
		
		double d_num=12+12.5;
		System.out.println(d_num);
		
		String num = "10";
		int sum=10 + Integer.valueOf(num);
		System.out.println(sum);		
		

	}
}
