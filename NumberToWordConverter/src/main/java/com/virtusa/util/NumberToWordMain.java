package com.virtusa.util;

import java.util.Scanner;

public class NumberToWordMain {

	public static void main(String[] args) {
		int inputNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide input number - max upto 9 digits ");
		try {
			// read the scanner for input number
			inputNumber = scanner.nextInt(); // returns Int.. If String or more than 9 digits throws exception
			if (inputNumber == 0) {
				System.out.print("number = Zero");
			} else {
				NumberToWordConversion numberToWordConversion = new NumberToWordConversion();
				System.out.print("number = " + numberToWordConversion.convertNumberToWord(inputNumber));
			}
		} catch (Exception e) {
			System.out.println("Provide input number - max upto 9 digits OR Enter a Valid Integer number");
		}
		// close the scanner
		scanner.close();
	}

}