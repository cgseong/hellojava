package Lesson08;

class Shape {
    public void area() {
        // 각 하위 클래스의 기능에 모두 맞출 수 없으므로 비워둠.
    }
}
class Circle1 extends Shape {
    int r = 3;
    
    @Override
    public void area() {
        System.out.println("원의 넓이 : " + (Math.PI * r * r));
    }
}
 
class Rectangle1 extends Shape{
    int w = 2, h = 3;
    
    @Override
    public void area() {
        System.out.println("사각형의 넓이 : " + (w * h));
    }
}
 
class Triangle1 extends Shape{
    int w = 2, h = 3;
    
    @Override
    public void area() {
        System.out.println("삼각형의 넓이 : " + (w * h) / 2);
    }
}
public class OverridingTest1 {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
        c.area();
        
        Rectangle1 r = new Rectangle1();
        r.area();
        
        Triangle1 t = new Triangle1();
        t.area();
	}
}