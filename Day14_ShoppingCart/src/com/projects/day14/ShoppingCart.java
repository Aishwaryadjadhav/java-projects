package com.projects.day14;

import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Online Shopping Cart ---");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Remove Item");
            System.out.println("4. Checkout & Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    cart.add(new Item(name, price));
                    System.out.println("Item added to cart!");
                    break;

                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        System.out.println("\nYour Cart:");
                        double total = 0;
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println((i + 1) + ". " + cart.get(i));
                            total += cart.get(i).price;
                        }
                        System.out.println("Total: Rs." + total);
                    }
                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        System.out.print("Enter item number to remove: ");
                        int removeIndex = sc.nextInt();
                        if (removeIndex > 0 && removeIndex <= cart.size()) {
                            System.out.println("Removed: " + cart.remove(removeIndex - 1));
                        } else {
                            System.out.println("Invalid item number!");
                        }
                    }
                    break;

                case 4:
                    double total = 0;
                    for (Item item : cart) {
                        total += item.price;
                    }
                    System.out.println("\n Checkout complete! Total amount = Rs." + total);
                    System.out.println("Thank you for shopping with us!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
	}

}
