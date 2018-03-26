package changeCalc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double change = 0;
		int quarter = 0, dime = 0, nickel = 0, penny = 0;
		Scanner number = new Scanner(System.in);

		System.out.println("Please input how much change you have in dollars and I will calculate the change");

		try {
			change = Double.parseDouble(number.nextLine());
		} catch (Exception e) {
			System.out.println("Wrong input! Please use correct input!");
		}
		quarter = (int) (change / .25);
		change = ((change * 100) % 25) / 100;
		dime = (int) (change / .1);
		change = ((change * 100) % 10) / 100;
		nickel = (int) (change / .05);
		change = ((change * 100) % 5) / 100;
		penny = (int) (change / .01);
		change = ((change * 100) % 1) / 100;


		System.out.println("Quarters: " + quarter + "\nDimes: " + dime + "\nNickels: " + nickel + "\nPennies: " + penny);

		number.close();
	}
}
