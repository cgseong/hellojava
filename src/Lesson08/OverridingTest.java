package Lesson08;

class Circle {
    int r = 3;
    
    public void area() {
        System.out.println("¿øÀÇ ³ÐÀÌ : " + (Math.PI * r * r));
    }
}
 
class Rectangle {
    int w = 2, h = 3;
    
    public void area() {
        System.out.println("»ç°¢ÇüÀÇ ³ÐÀÌ : " + (w * h));
    }
}
 
class Triangle {
    int w = 2, h = 3;
    
    public void area() {
        System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : " + (w * h) / 2);
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