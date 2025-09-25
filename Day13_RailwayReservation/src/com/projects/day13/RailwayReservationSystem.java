package com.projects.day13;

import java.util.ArrayList;
import java.util.Scanner;

public class RailwayReservationSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        ArrayList<Passenger> bookings = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Railway Reservation System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Booked Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Seat No: ");
                    int seatNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Train No: ");
                    int trainNo = sc.nextInt();

                    bookings.add(new Passenger(seatNo, name, age, trainNo));
                    System.out.println("Ticket Booked Successfully!");
                    break;

                case 2:
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        System.out.println("--- Booked Tickets ---");
                        for (Passenger p : bookings) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Seat No to Cancel: ");
                    int cancelSeat = sc.nextInt();
                    boolean removed = false;
                    for (Passenger p : bookings) {
                        if (p.seatNo == cancelSeat) {
                            bookings.remove(p);
                            System.out.println("Ticket Cancelled Successfully!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Ticket not found!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Railway Reservation System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
	}

}
