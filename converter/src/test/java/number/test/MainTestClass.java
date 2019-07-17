package number.test;

import java.util.Scanner;

import util.BritishNumberConverter;

public class MainTestClass {

	public static void main(String arg[]) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 999999999 digits)");
		try {
			// read the number
			number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				System.out.print("Number in words: " + new BritishNumberConverter().convert(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
		// close the reader
		scanner.close();
		
	}
}
