package Lesson07;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box();
        Box mybox2 = new Box(10,20,30);
        
        double vol;
        
        vol = mybox1.volume();
        System.out.println("�⺻ �ڽ��� ���Ǵ� " + vol);
        
        vol = mybox2.volume();
        System.out.println("����� ���� �ڽ��� " + vol);

	}

}
