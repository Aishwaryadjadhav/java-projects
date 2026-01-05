package com.projects.day16;

import java.util.Scanner;
import java.util.ArrayList;

public class AttendanceApp {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> attendanceList = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Employee Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Present or Absent: ");
                String status = sc.nextLine();

                attendanceList.add(name + " - " + status);
                System.out.println("Attendance added successfully!");

            } else if (choice == 2) {
                if (attendanceList.isEmpty()) {
                    System.out.println("No attendance records found.");
                } else {
                    System.out.println("\nAttendance List:");
                    for (String record : attendanceList) {
                        System.out.println(record);
                    }
                }

            } else if (choice == 3) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid option!");
            }
        }
    }
}


