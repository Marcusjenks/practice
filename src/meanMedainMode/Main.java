//This program will fine the mean, median and mode for numbers input by the user
package meanMedainMode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter in your values.");
		Scanner number = new Scanner(System.in);
		String input = number.nextLine();
		String[] strglist = input.split(" ");
		int[] list = new int[strglist.length];

		for (int i = 0; i < strglist.length; i++) {
			try {
				list[i] = Integer.parseInt(strglist[i]);
				System.out.println(list[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		mean(list);
		median(list);
		number.close();
	}

	public static void mean(int[] numbers) {
		int sum = IntStream.of(numbers).sum();
		float value = (float) sum / (float) numbers.length;
		System.out.println(value);
	}

	public static void median(int[] numbers) {
		Arrays.sort(numbers);
		double middle;
		if (numbers.length % 2 == 0) {
			middle = ((double) numbers[numbers.length / 2] + (double) numbers[numbers.length / 2 - 1]);
		} else {
			middle = (double) numbers[numbers.length / 2];
		}

		System.out.println(middle);
	}

	public void mode() {

	}
}
