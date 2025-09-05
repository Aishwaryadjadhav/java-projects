package com.projects.day1;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);  

	        Random rand = new Random();  
	        
	        int numberToGuess = rand.nextInt(100) + 1;    // Generate random number between 1 and 100

	        int guess;        // To store user’s guess
	        int attempts = 0; // To count number of attempts

	        System.out.println("Guess a number between 1 and 100:");

	        
	        do {  // Loop until user guesses correctly
	        	
	            guess = sc.nextInt();  // take input
	            attempts++;            // increment attempt count

	            if (guess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
	            }
	        } while (guess != numberToGuess);

	        sc.close();

	}

}
