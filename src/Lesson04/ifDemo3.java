package Lesson04;

public class ifDemo3 {

	public static void main(String[] args) {
	    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        // n1�� n2���� ũ�ų� ������ �˻�
        if (n1 >= n2) {

            // if ��� ������ ...block ������ n1�� n3���� ũ�ų� ������ Ȯ���ϸ�           
            if (n1 >= n3) {
                largestNumber = n1;
            }
            else {
                largestNumber = n3;
            }
        }
        else {

            // else ��� ������ ...block ������n2�� n3���� ũ�ų� ������ �˻�
            
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
