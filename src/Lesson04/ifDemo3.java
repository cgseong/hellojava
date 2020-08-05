package Lesson04;

public class ifDemo3 {

	public static void main(String[] args) {
	    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        // n1이 n2보다 크거나 같은지 검사
        if (n1 >= n2) {

            // if 블록 내부의 ...block 문에서 n1이 n3보다 크거나 같은지 확인하면           
            if (n1 >= n3) {
                largestNumber = n1;
            }
            else {
                largestNumber = n3;
            }
        }
        else {

            // else 블록 내부의 ...block 문에서n2가 n3보다 크거나 같은지 검사
            
            if (n2 >= n3) {
                largestNumber = n2;
            }
            else {
                largestNumber = n3;
            }
        }

        System.out.println("The largest number is " + largestNumber);   
	}
}
