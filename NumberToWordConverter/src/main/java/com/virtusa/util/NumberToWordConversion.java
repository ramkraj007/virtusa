package com.virtusa.util;

public class NumberToWordConversion {

	public String convertNumberToWord(int inputNumber) {

		String words = "";
		String singleDigitNames[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		String doubleDigitNames[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (inputNumber == 0) {
			return "zero";
		}
		
		// add minus before conversion if the inputNumber is less than 0
		if (inputNumber < 0) { // convert the inputNumber to a string
			String inputNumberStr = "" + inputNumber;
			// remove minus before the inputNumber
			inputNumberStr = inputNumberStr.substring(1);
			// add minus before the inputNumber and convert the rest of inputNumber
			return "minus " + convertNumberToWord(Integer.parseInt(inputNumberStr));
		}
		
		// check if inputNumber is divisible by 1 million
		if ((inputNumber / 1000000) > 0) {
			words += convertNumberToWord(inputNumber / 1000000) + " million ";
			inputNumber %= 1000000;
		}
		
		// check if inputNumber is divisible by 1 thousand
		if ((inputNumber / 1000) > 0) {

			words += convertNumberToWord(inputNumber / 1000) + " thousand ";
			inputNumber %= 1000;
		}
		
		if ((inputNumber / 100) > 0) {

			words += convertNumberToWord(inputNumber / 100) + " hundred ";
			if (!(inputNumber % 100 == 0)) {
				words += "and ";
			}
			inputNumber %= 100;
		}

		if (inputNumber > 0) {
			if (inputNumber < 20) {
				words += singleDigitNames[inputNumber];
			} else {
				words += doubleDigitNames[inputNumber / 10];
				if ((inputNumber % 10) > 0) {
					words += " " + singleDigitNames[inputNumber % 10];
				}
			}
		}

		return words;
	}
}
