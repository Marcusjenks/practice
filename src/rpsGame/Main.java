package rpsGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int compRPS, playerRPS;

		playerRPS = inputRPS();
		compRPS = computerRPS();
		rpsGame(playerRPS, compRPS);

		System.out.print(playerRPS + " " + compRPS);

	}

	private static void rpsGame(int playerRPS, int compRPS) {
		
		if(playerRPS == 1) {
			
			if (playerRPS == compRPS) {
				System.out.println("You picked the same as the computer!");
			}else if (compRPS == 2){
				System.out.println("You Lose!");
			} else if (compRPS == 3){
				System.out.println("You Won!");
			}
		} else if(playerRPS == (2)) {
			if (playerRPS == compRPS) {
				System.out.println("You picked the same as the computer!");
			}else if (compRPS == 1){
				System.out.println("You Won!");
			} else if (compRPS == 3){
				System.out.println("You Lose!");
			}
		} else if(playerRPS == (3)) {
			if (playerRPS == compRPS) {
				System.out.println("You picked the same as the computer!");
			}else if (compRPS == 1) {
				System.out.println("You Lose!");
			} else if (compRPS == 2){
				System.out.println("You Won!");

			}
		}
	}

	public static int inputRPS() {
		Scanner input = new Scanner(System.in);
		String answer;
		int rps = 0;

		System.out.println("Do you pick (1)Rock (2)Paper or (3) Scissors?");
		answer = input.nextLine();

		try {
			rps = Integer.parseInt(answer);
		} catch (Exception e) {
			System.out.println("Please enter the correct input!");
		}
		input.close();
		return rps;
	}

	public static int computerRPS() {
		Random otherRps = new Random();
		return otherRps.nextInt(3) + 1;

	}
}
