package Lesson06;

public class foreachDemo {
	public static void main(String[] args) {
		int[] scores = { 125, 132, 95, 116, 110 };
		int maxNum = scores[0];          
	    // for each loop
		for (int num : scores) {
			if (num > maxNum) {
				maxNum = num; 
	        } 
	    }
		System.out.println("The highest score is " + maxNum); 
	}
}