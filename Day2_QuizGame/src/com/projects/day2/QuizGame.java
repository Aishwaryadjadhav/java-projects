package com.projects.day2;

import java.util.Scanner;

public class QuizGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        String[] questions = {    // Questions 
            "Q1: What is the capital of India?",
            "Q2: Who invented Java?",
            "Q3: Which keyword is used to inherit a class in Java?"
        };

        String[][] options = {    // Options
            {"1. Delhi", "2. Mumbai", "3. Pune", "4. Kolkata"},
            {"1. James Gosling", "2. Dennis Ritchie", "3. Guido van Rossum", "4. Bjarne Stroustrup"},
            {"1. implements", "2. extends", "3. inherits", "4. import"}
        };

        int[] answers = {1, 1, 2}; // Correct options

        int score = 0;

       
        for (int i = 0; i < questions.length; i++) {   // Loop through questions
            System.out.println(questions[i]);

           
            for (String option : options[i]) {  // Print options
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();

           
            if (userAnswer == answers[i]) {   // Check answer
                System.out.println("Correct! ✅\n");
                score++;
            } else {
                System.out.println("Wrong! ❌ Correct answer is: " + answers[i] + "\n");
            }
        }

        // Final Score
        System.out.println("Your Final Score: " + score + "/" + questions.length);
        sc.close();

	}

}
