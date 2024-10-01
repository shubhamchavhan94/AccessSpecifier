package com.velocity.protecteds.specifiers;

public class Employee { //Employee is outer class
	//protected cant apply to outer class

	protected class Test { //Test is inner class

	}

	protected int a;// a is global variable

	protected void getEmployee() { // method
		System.out.println("This is getEmployee() method...");
	}

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.getEmployee();
		int c; //c is local variable - local variable cant be protected
	}
}
