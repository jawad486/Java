package oops;

public class Polymorphsim {
	
	static String name ="jawad";
	static String lastName="qureshi";
	
	public static void main(String[] args) {
	
		Polymorphsim p=new Polymorphsim();
		p.display(name);
		p.display(name, lastName);
	}
	
	public void display(String name) {
		System.out.println("my name is :"+name);
		
	}
	
	public void display(String name, String lastName) {
		System.out.println("my name is :"+name+lastName);
		
	}

}
