package com.projects.day11;

public class Employee {
	
	    int id;
	    String name;
	    double salary;

	    // Constructor
	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Display details
	    void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	    
	}

}
