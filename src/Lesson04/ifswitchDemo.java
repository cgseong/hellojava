package Lesson04;

public class ifswitchDemo {

	public static void main(String[] args) {
		int grade = Integer.parseInt(args[0]);
//		if (grade >=90)
//			 System.out.println("A");
//		else if (grade >=80)
//			 System.out.println("B");
//		else if (grade >=70)
//			 System.out.println("C");
//		else if (grade >=60)
//			 System.out.println("D");
//		else
//			 System.out.println("Fail");
		 
		switch ((int)(grade/10)) {
        case 10: 
        	System.out.println("A"); 
        	break;
        case  9: 
        	System.out.println("A"); 
        	break;
        case  8: 
        	System.out.println("B"); 
        	break;
        case  7: 
        	System.out.println("C"); 
        	break;
        case  6: 
        	System.out.println("D"); 
        	break;
        default: 
        	System.out.println("Fail");
		}//switch
	}
}
