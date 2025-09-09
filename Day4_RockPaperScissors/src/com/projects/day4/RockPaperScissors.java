package com.projects.day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("====== Rock-Paper-Scissors ======");

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Choose your move (1-3): ");
        int user = sc.nextInt();

        int computer = rand.nextInt(3) + 1;

        System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);

        if (user == computer) {
            System.out.println("It's a DRAW!");
        } else if ((user == 1 && computer == 3) ||
                   (user == 2 && computer == 1) ||
                   (user == 3 && computer == 2)) {
            System.out.println("You WIN!");
        } else {
            System.out.println("Computer WINS!");
        }

        sc.close();

	}

}
