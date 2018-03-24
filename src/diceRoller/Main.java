package diceRoller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int roll, sides = 0;
		String playAgain;

		Random result = new Random();

		ArrayList<Integer> diceNumbers = new ArrayList<Integer>();

		Scanner dice = new Scanner(System.in);

		boolean rolling = true;
		while (rolling) {

			System.out.println("How many sides does the dice have?");

			try {
				sides = Integer.parseInt(dice.nextLine());
			} catch (Exception e) {
				System.out.println("I'm sorry I couldn't understand that input.");
			}

			roll = result.nextInt(sides);
			System.out.println(roll);
			diceNumbers.add(roll);

			System.out.println("Do you want to roll again?");
			playAgain = dice.nextLine();

			if (playAgain.equals("n")) {
				rolling = false;
			}

		}
		System.out.println("Your dice results: " + Arrays.toString(diceNumbers.toArray()));
		dice.close();
	}
}
