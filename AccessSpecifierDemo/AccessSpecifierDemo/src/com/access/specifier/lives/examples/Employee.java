package com.access.specifier.lives.examples;

public class Employee {

	private void addEmployee() {
		System.out.println("this is add operation....");
	}

	private void updateEmployee() {
		System.out.println("this is update operation....");
	}

	private void fetchEmployee() {
		System.out.println("this is fetch operation....");
	}

	private void deleteEmployee() {
		System.out.println("this is delete operation....");
	}
	
	public void getEmployeeData() {
		addEmployee();
		updateEmployee();
		fetchEmployee();
		deleteEmployee();
	}
}
