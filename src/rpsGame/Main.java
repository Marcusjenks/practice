package rpsGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int compRps, playerRPS;

			playerRPS = inputRPS();
			compRps = computerRPS();

			System.out.print(playerRPS + " " + compRps);

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
