package com.projects.day10;

import java.util.Scanner;
public class LibraryManagement {
	
	 // Array to store book names
    static String[] books = new String[100];
    static int count = 0;

    // Method to add a book
    public static void addBook(String bookName) {
        books[count] = bookName;
        count++;
        System.out.println("Book added successfully!");
    }

    // Method to search for a book
    public static void searchBook(String bookName) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].equalsIgnoreCase(bookName)) {
                System.out.println("Book found: " + books[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Method to delete a book
    public static void deleteBook(String bookName) {
        boolean deleted = false;
        for (int i = 0; i < count; i++) {
            if (books[i].equalsIgnoreCase(bookName)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book deleted successfully!");
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            System.out.println("Book not found!");
        }
    }

    // Method to display all books
    public static void displayBooks() {
        if (count == 0) {
            System.out.println("No books in library.");
        } else {
            System.out.println("\n--- Library Books ---");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    addBook(book);
                    break;
                case 2:
                    System.out.print("Enter book name to search: ");
                    String search = sc.nextLine();
                    searchBook(search);
                    break;
                case 3:
                    System.out.print("Enter book name to delete: ");
                    String delete = sc.nextLine();
                    deleteBook(delete);
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();	

	}

}
