package rpsGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random otherRps = new Random();
		Scanner input = new Scanner(System.in);
		String answer;
		int rps = 0, compRps;

		System.out.println("Do you pick (1)Rock (2)Paper or (3) Scissors?");
		answer = input.nextLine();

		try {
			rps = Integer.parseInt(answer);
		} catch (Exception e) {
			System.out.println("Please enter the correct input!");
		}
		
		compRps = otherRps.nextInt(3) + 1;
		
		System.out.print(rps + " " + compRps);

		input.close();
	}
}
