package Lesson03;

public class methodDemo {

	public static void main(String[] args) {
		seoul();  //seoul �޼ҵ� ȣ��
 		pusan();  //pusan �޼ҵ� ȣ��
	}
	public static void seoul() 
 	{
 		int people=9720846;
 		System.out.println("���� �α��� = " + people + "��"); 
 	}	 
    public static void pusan() 
 	{
 		//int people=3404423;
 		//System.out.println("�λ� �α��� = " + people + "��");
    	// Maximum prescribed value for Integer data
    	int varInt1 = 2147483647; 
    	System.out.println(varInt1);

    	// Minimum prescribed value for Integer data
    	int varInt2 = -2147483647; 
    	System.out.println(varInt2);
 	}	 
}