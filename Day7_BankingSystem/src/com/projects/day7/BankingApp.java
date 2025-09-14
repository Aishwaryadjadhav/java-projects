package com.projects.day7;

import java.util.Scanner;
public class BankingApp {

	public static void main(String[] args) {
		
		double balance = 0.0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SIMPLE BANKING SYSTEM ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: " + deposit);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: " + withdraw);
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using Banking App!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, try again!");
            }
        }

	}

}
