package magic8Ball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Give me a yes or no question and I shall answer it!");
		Scanner question = new Scanner(System.in);
		String input = question.nextLine();

		question.close();

		int response = (int) (Math.random() * 4 + 1);

		switch (response) {
		case 1:
			System.out.println("Most definetely yes!");
			break;
		case 2:
			System.out.println("For certain: NO!");
			break;
		case 3:
			System.out.println("I'm too tired to calculate an answer");
			break;
		case 4:
			System.out.println("uhhh..yeah..sure..");
			break;
		}

	}

}
