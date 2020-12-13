package Lesson07;

public class demoClass {
	demoClass(){
		System.out.println("기본 생성자 호출");
	}
	demoClass(int i, String s){
		System.out.println("생성자1 호출");
	}	
	demoClass(String s){
		System.out.println("생성자3 호출");
	}
	demoClass(int i){
		System.out.println("생성자2 호출");
		}	
}