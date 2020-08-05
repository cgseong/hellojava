package Lesson04;

public class ifDemo4 {

	public static void main(String[] args) {
		Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        // n1이 가장 큰 값인지 검사
        if (n1 >= n2 && n1 >= n3)
        	largestNumber = n1;
        // n2가 가장 큰 값인지 검사
        else if (n2 >= n1 && n2 >= n1)
        	largestNumber = n2;
        else
        	largestNumber = n3;
        System.out.println("The largest number is " + largestNumber);

	}

}
