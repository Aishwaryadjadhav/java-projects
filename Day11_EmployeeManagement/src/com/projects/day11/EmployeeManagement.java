package com.projects.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
	
	 static ArrayList<Employee> employees = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    // Add Employee
	    public static void addEmployee() {
	        System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();

	        employees.add(new Employee(id, name, salary));
	        System.out.println("Employee added successfully!");
	    }

	    // View all employees
	    public static void viewEmployees() {
	        if (employees.isEmpty()) {
	            System.out.println("No employees found!");
	        } else {
	            System.out.println("\n--- Employee List ---");
	            for (Employee e : employees) {
	                e.display();
	            }
	        }
	    }

	    // Search employee by ID
	    public static void searchEmployee() {
	        System.out.print("Enter Employee ID to search: ");
	        int id = sc.nextInt();
	        boolean found = false;

	        for (Employee e : employees) {
	            if (e.id == id) {
	                e.display();
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Employee not found!");
	        }
	    }

	    // Delete employee by ID
	    public static void deleteEmployee() {
	        System.out.print("Enter Employee ID to delete: ");
	        int id = sc.nextInt();
	        boolean removed = false;

	        for (Employee e : employees) {
	            if (e.id == id) {
	                employees.remove(e);
	                System.out.println("Employee deleted successfully!");
	                removed = true;
	                break;
	            }
	        }

	        if (!removed) {
	            System.out.println("Employee not found!");
	        }
	    }

	    

	public static void main(String[] args) {
		
		int choice;
        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break;
                case 3: searchEmployee(); break;
                case 4: deleteEmployee(); break;
                case 5: System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
		
		

	}

}
