package Lesson03;

public class parameterDemo {
	public static void main(String[] args) {
		seoul(9720846);  //seoul 메소드 호출
 		pusan(3404423);  //pusan 메소드 호출 
	}
	public static void seoul(int people) 
    {
	System.out.println("서울 인구수 = " + people + "명"); 
    } 
    public static void pusan(int people)
    { 
      	 System.out.println("부산 인구수 = " + people + "명");
    }
}
