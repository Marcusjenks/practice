package diceRoller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int roll, sides = 0, diceRolls = 0;
		String playAgain;

		Random result = new Random();

		ArrayList<Integer> diceNumbers = new ArrayList<Integer>();

		Scanner dice = new Scanner(System.in);

		boolean rolling = true;
		while (rolling) {

			System.out.println("How many sides does the dice have?");

			try {
				sides = Integer.parseInt(dice.nextLine());
				System.out.println("How many times should I roll the dice?");
				diceRolls = Integer.parseInt(dice.nextLine());
			} catch (Exception e) {
				System.out.println("I'm sorry I couldn't understand that input.");
			}
			for (int i = 0; i < diceRolls; i++) {
				roll = result.nextInt(sides);
				diceNumbers.add(roll);
			}

			System.out.println("Your dice results: " + Arrays.toString(diceNumbers.toArray()));

			System.out.println("Do you want to roll again?");
			playAgain = dice.nextLine();

			if (playAgain.equals("n")) {
				rolling = false;
			}
			
			diceNumbers.clear();
		}
		dice.close();
	}
}
