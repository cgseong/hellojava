package Lesson07;

public class Box {
	double width;
    double height;
    double depth;
    
    public Box()
    {
        System.out.println("�⺻ �ڽ� ����");
        width = 100;
        height = 100;
        depth = 100;
    }
    Box(int w, int h, int d)
    {
        System.out.println("����� ũ�� �ڽ� ����");
        width = w;
        height = h;
        depth = d;
    }
    
    double volume()
    {
        return width * height * depth;
    }

}
