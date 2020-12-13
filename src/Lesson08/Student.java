package Lesson08;

public class Student extends Person {
	private String number;
	
	Student(){}
	Student(String name, String phone, String number){
		super(name,phone);
		this.number=number;		
	}
	
	void study() {
		System.out.println("공부한다.");
	}
	void displayStdunt() {
		displayPerson();
		System.out.println(number);
	}
}
