package Lesson07;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1 = new Box();
        Box mybox2 = new Box(10,20,30);
        
        double vol;
        
        vol = mybox1.volume();
        System.out.println("기본 박스의 부피는 " + vol);
        
        vol = mybox2.volume();
        System.out.println("사용자 정의 박스는 " + vol);

	}

}
