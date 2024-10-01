package com.velocity.publics.specifiers;

public class Example { //Example is outer class- 

	public class Sample{ //sample is inner class
		
	}
	public int a; //a is global variable
	
	public void getExample() { //method
		int y; //y is local variable, local variable cant be public
		System.out.println("This is method...");
	}
	public static void main(String[] args) {
		
		Example example=new Example();
		example.getExample(); //within same class
	}
}
