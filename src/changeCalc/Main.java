package changeCalc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {
		BigDecimal change, price, paid, quarter = new BigDecimal(25), dime = new BigDecimal(10),
				nickel = new BigDecimal(5), penny = new BigDecimal(1);

		BigDecimal quarters = new BigDecimal(0), dimes = new BigDecimal(0), nickels = new BigDecimal(0),
				pennies = new BigDecimal(0);
		
		String response;

		Prompt getPrice = new Prompt();
		Prompt getPaid = new Prompt();
		Prompt again = new Prompt();

		boolean running = true;

		while (running) {

			price = getPrice.money("How much does the item cost?");

			paid = getPaid.money("How much money did pay?");

			change = (paid.subtract(price)).multiply(new BigDecimal(100));

			if (change.compareTo(BigDecimal.ZERO) >= 0) {
				quarters = change.divide(quarter, 0, RoundingMode.DOWN);
				change = change.remainder(quarter);

				dimes = change.divide(dime, 0, RoundingMode.DOWN);
				change = change.remainder(dime);

				nickels = change.divide(nickel, 0, RoundingMode.DOWN);
				change = change.remainder(nickel);

				pennies = change.divide(penny, 0, RoundingMode.DOWN);
			} else {
				System.out.println("You didn't pay enough money!");
			}

			System.out.println("Quarters: " + quarters.toString() + "\nDimes: " + dimes.toString() + "\nNickels: "
					+ nickels.toString() + "\nPennies: " + pennies.toString());
			
			response = again.getString("\nDo you want to calculate change again?(input 'n' to quit)");
			
			if (response.equals("n")){
					running = false;
			}
			
		}
	}

}
