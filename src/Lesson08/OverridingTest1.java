package Lesson08;

class Shape {
    public void area() {
        // �� ���� Ŭ������ ��ɿ� ��� ���� �� �����Ƿ� �����.
    }
}
class Circle1 extends Shape {
    int r = 3;
    
    @Override
    public void area() {
        System.out.println("���� ���� : " + (Math.PI * r * r));
    }
}
 
class Rectangle1 extends Shape{
    int w = 2, h = 3;
    
    @Override
    public void area() {
        System.out.println("�簢���� ���� : " + (w * h));
    }
}
 
class Triangle1 extends Shape{
    int w = 2, h = 3;
    
    @Override
    public void area() {
        System.out.println("�ﰢ���� ���� : " + (w * h) / 2);
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