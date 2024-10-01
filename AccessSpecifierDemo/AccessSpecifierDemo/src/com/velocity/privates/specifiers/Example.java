package com.velocity.privates.specifiers;

public class Example { // Example is outer class

	// outer class cant be private
	private class Test { // Test is inner class

	}

	private int a; // a is global variable

	private void getData() { // getData() is method
		int b; // b is local variable, local variable cant be private
		System.out.println("This is getData() method..");
	}

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.a); //access or call
	}
}
