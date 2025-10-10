package com.projects.day15;

import java.io.*;
import java.util.Scanner;

public class FileHandlerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String fileName = "notes.txt"; // File to save and read data

        while (true) {
            System.out.println("\n--- File Handling Project ---");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to write: ");
                    String data = sc.nextLine();
                    try (FileWriter writer = new FileWriter(fileName, true)) {
                        writer.write(data + "\n");
                        System.out.println("Data written to file successfully!");
                    } catch (IOException e) {
                        System.out.println("Error writing to file: " + e.getMessage());
                    }
                    break;

                case 2:
                    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                        System.out.println("\n📖 File Contents:");
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found!");
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

	}

}
