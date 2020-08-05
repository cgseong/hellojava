package Lesson03;

public class methodDemo {

	public static void main(String[] args) {
		seoul();  //seoul 메소드 호출
 		pusan();  //pusan 메소드 호출
	}
	public static void seoul() 
 	{
 		int people=9720846;
 		System.out.println("서울 인구수 = " + people + "명"); 
 	}	 
    public static void pusan() 
 	{
 		//int people=3404423;
 		//System.out.println("부산 인구수 = " + people + "명");
    	// Maximum prescribed value for Integer data
    	int varInt1 = 2147483647; 
    	System.out.println(varInt1);

    	// Minimum prescribed value for Integer data
    	int varInt2 = -2147483647; 
    	System.out.println(varInt2);
 	}	 
}