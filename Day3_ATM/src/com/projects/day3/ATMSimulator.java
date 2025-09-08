package com.projects.day3;

import java.util.Scanner;
public class ATMSimulator {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);  // Create a Scanner for console input
	double balance = 0.0;                 // User account balance (starts at 0)
	boolean exit = false;                 // Controls the main loop

	System.out.println("====== Welcome to the ATM ======");

	        
	        while (!exit) {   // Keep showing the menu until the user chooses to exit
	            // Show options
	            System.out.println("\n1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option (1-4): ");

	           
	            int choice;   // Read menu choice safely
	            if (sc.hasNextInt()) {
	                choice = sc.nextInt();
	            } else {
	                System.out.println("Invalid input. Please enter a number between 1 and 4.");
	                sc.next(); // clear the invalid token
	                continue;  // restart loop
	            }

	            switch (choice) {
	                case 1: // Check balance
	                    System.out.printf("Your balance is: ₹%.2f%n", balance);
	                    break;

	                case 2: // Deposit
	                    System.out.print("Enter amount to deposit: ");
	                    if (sc.hasNextDouble()) {
	                        double amount = sc.nextDouble();
	                        if (amount <= 0) {
	                            System.out.println("Amount must be positive.");
	                        } else {
	                            balance += amount;
	                            System.out.printf("Deposited ₹%.2f. New balance: ₹%.2f%n", amount, balance);
	                        }
	                    } else {
	                        System.out.println("Invalid amount.");
	                        sc.next(); // clear invalid token
	                    }
	                    break;

	                case 3: // Withdraw
	                    System.out.print("Enter amount to withdraw: ");
	                    if (sc.hasNextDouble()) {
	                        double amount = sc.nextDouble();
	                        if (amount <= 0) {
	                            System.out.println("Amount must be positive.");
	                        } else if (amount > balance) {
	                            System.out.println("Insufficient funds!");
	                        } else {
	                            balance -= amount;
	                            System.out.printf("Withdrew ₹%.2f. New balance: ₹%.2f%n", amount, balance);
	                        }
	                    } else {
	                        System.out.println("Invalid amount.");
	                        sc.next(); // clear invalid token
	                    }
	                    break;

	                case 4: // Exit
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Please choose a valid option (1-4).");
	            }
	        }

	        sc.close(); // Free the scanner resource	

	}

}
