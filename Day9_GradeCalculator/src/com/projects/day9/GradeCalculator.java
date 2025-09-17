package com.projects.day9;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter total number of subjects: ");
	        int subjects = sc.nextInt();

	        int total = 0;
	        for (int i = 1; i <= subjects; i++) {
	            System.out.print("Enter marks for subject " + i + ": ");
	            total += sc.nextInt();
	        }

	        double percentage = (double) total / subjects;
	        char grade;

	        if (percentage >= 90) grade = 'A';
	        else if (percentage >= 75) grade = 'B';
	        else if (percentage >= 50) grade = 'C';
	        else grade = 'F';

	        System.out.println("\n--- RESULT ---");
	        System.out.println("Total Marks = " + total);
	        System.out.println("Percentage = " + percentage + "%");
	        System.out.println("Grade = " + grade);

	        sc.close();

	}

}
