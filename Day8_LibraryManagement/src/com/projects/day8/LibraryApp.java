package com.projects.day8;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- LIBRARY MANAGEMENT ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name to add: ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book added: " + book);
                    break;

                case 2:
                    System.out.println("\n Books in Library:");
                    if (books.isEmpty()) {
                        System.out.println("No books available!");
                    } else {
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book name to search: ");
                    String search = sc.nextLine();
                    if (books.contains(search)) {
                        System.out.println(" Found: " + search);
                    } else {
                        System.out.println(" Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter book number to delete: ");
                    int index = sc.nextInt();
                    if (index > 0 && index <= books.size()) {
                        System.out.println(" Book removed: " + books.remove(index - 1));
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting Library App. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, try again!");
            }
        }
	 

	}

}
