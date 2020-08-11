package Lesson06;

public class arraySumDemo {

	public static void main(String[] args) {
		double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        
        double average = total / arr.length;        
        
        System.out.format("The average is: %.3f", average);
	}
}