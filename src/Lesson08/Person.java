package Lesson08;

public class Person {
	private String name;
	private String phone;
	
	Person(){
	}
	Person(String name, String phone){
		this.name=name;
		this.phone=phone;
	}
	
	void eat() {
		System.out.println("�Դ´�");
	}
	void sleep() {
		System.out.println("���ܴ�");
	}
	void displayPerson() {
		System.out.println(name);
		System.out.println(phone);
	}
}
