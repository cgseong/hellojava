package Lesson11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOEx02 {

	public static void main(String[] args) throws IOException {
		int count, loop;
		double sales;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �����͸� �Է��ұ��? ");
		count = sc.nextInt();
		
		PrintWriter wf = new PrintWriter("D:/Temp/sales.txt");
		for (loop = 1; loop <= count; loop++){ 
			System.out.print("�Ǹŷ��� �Է��Ͻÿ� #" + count + ": ");
			sales = sc.nextDouble();
			wf.println(sales);			
		}
		wf.close();	
		System.out.println("���� ���� �Ϸ�");
	}
}