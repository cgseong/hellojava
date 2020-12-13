package Lesson08;

class Circle {
    int r = 3;
    
    public void area() {
        System.out.println("���� ���� : " + (Math.PI * r * r));
    }
}
 
class Rectangle {
    int w = 2, h = 3;
    
    public void area() {
        System.out.println("�簢���� ���� : " + (w * h));
    }
}
 
class Triangle {
    int w = 2, h = 3;
    
    public void area() {
        System.out.println("�ﰢ���� ���� : " + (w * h) / 2);
    }
}

public class OverridingTest {

	public static void main(String[] args) {
		 Circle c = new Circle();
	     c.area();
	        
	     Rectangle r = new Rectangle();
	     r.area();
	        
	     Triangle t = new Triangle();
	     t.area();
	}
}