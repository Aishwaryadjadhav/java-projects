package com.projects.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagement {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Product> products = new ArrayList<>();

	        while (true) {
	            System.out.println("\n--- Inventory Management System ---");
	            System.out.println("1. Add Product");
	            System.out.println("2. View Products");
	            System.out.println("3. Search Product");
	            System.out.println("4. Update Quantity");
	            System.out.println("5. Delete Product");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Product ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Product Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Quantity: ");
	                    int qty = sc.nextInt();
	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();
	                    products.add(new Product(id, name, qty, price));
	                    System.out.println("Product Added!");
	                    break;

	                case 2:
	                    if (products.isEmpty()) {
	                        System.out.println("No products available.");
	                    } else {
	                        System.out.println("--- Product List ---");
	                        for (Product p : products) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Product ID to search: ");
	                    int searchId = sc.nextInt();
	                    boolean found = false;
	                    for (Product p : products) {
	                        if (p.id == searchId) {
	                            System.out.println("Found: " + p);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found) System.out.println("Product not found!");
	                    break;

	                case 4:
	                    System.out.print("Enter Product ID to update: ");
	                    int updateId = sc.nextInt();
	                    for (Product p : products) {
	                        if (p.id == updateId) {
	                            System.out.print("Enter new quantity: ");
	                            p.quantity = sc.nextInt();
	                            System.out.println("Quantity Updated!");
	                        }
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter Product ID to delete: ");
	                    int deleteId = sc.nextInt();
	                    products.removeIf(p -> p.id == deleteId);
	                    System.out.println("Product Deleted!");
	                    break;

	                case 6:
	                    System.out.println("Exiting... Thank you!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }

	}

}
