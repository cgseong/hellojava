package Lesson09;

public class Member {
	final int num;
	String name;
	public Member(int num, String name){
		this.num = num;
		this.name = name;
	}
	public int getNum(){
		return num;
	}
	public String toString(){
		return String.format("��ȣ:%d �̸�:%s", num,name);		
	}
}
