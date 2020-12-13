package Lesson08;

class Calculation {
	void sum(int a,int b){
		System.out.println(a+b);
	} 
	
	void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
	
	void sum(double a,double b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.sum(10,10,10);		
		c.sum(20,20);
		c.sum(20.0,20.0);
	}
}