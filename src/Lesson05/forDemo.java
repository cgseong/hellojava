// Program to find the sum of numbers from 1 to 100

package Lesson05;

public class forDemo {

	public static void main(String[] args) {
		int sum = 0;
		   
        for (int i = 1; i <= 1000; ++i) {
            sum += i;     // sum = sum + i
        }
        
        System.out.println("Sum = " + sum);
	}
}