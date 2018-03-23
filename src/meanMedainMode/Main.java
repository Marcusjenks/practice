<<<<<<< Upstream, based on origin/master
//This program will fine the mean, median and mode for numbers input by the user
=======
//This program will calculate the mean, median and mode for number input by user
>>>>>>> 327bd86 Implement mode and fixed median
package meanMedainMode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		mean(list);
		median(list);
		mode(list);
		number.close();
	}

	public static void mean(int[] numbers) {
		int sum = IntStream.of(numbers).sum();
		float value = (float) sum / (float) numbers.length;
		System.out.println("Mean: " + value);
	}

	public static void median(int[] numbers) {
		Arrays.sort(numbers);
		double middle;
		if (numbers.length % 2 == 0) {
			middle = (((double) numbers[numbers.length / 2] + (double) numbers[numbers.length / 2 - 1]) / 2);
		} else {
			middle = (double) numbers[numbers.length / 2];
		}

		System.out.println("Median: " + middle);
	}

	public static void mode(int[] numbers) {
		Arrays.sort(numbers);
		List<Integer> values = new ArrayList<Integer>();
		int maxCount = 0;

		for (int i = 0; i < numbers.length; ++i) {
			int count = 0;
			for (int j = 0; j < numbers.length; ++j) {
				if (numbers[j] == numbers[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				values.clear();
				values.add(numbers[i]);
			} else if (count == maxCount) {
				if (numbers[i] != numbers[i - 1]) {
					values.add(numbers[i]);
				}
			}
		}
		System.out.println("Mode: " + Arrays.toString(values.toArray()));
	}
}
