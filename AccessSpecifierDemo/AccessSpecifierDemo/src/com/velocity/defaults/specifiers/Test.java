package com.velocity.defaults.specifiers;

public class Test { //outer class can be default

	class Sample{  //Sample is inner class
		
	}
	int a; //a is global variable
	
	void getTest() { //method
		System.out.println("This is getTest() method...");
	}
	public static void main(String[] args) {
		
		int b; //b is local variable
		Test test=new Test();
		test.getTest(); //can access within same class
	}
}
