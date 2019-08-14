package com.virtusa.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToWordConverterTest {

	@Test
	public void testConvertNumberToWord() {
		NumberToWordConversion numberToWordConversionTest = new NumberToWordConversion();
    	
    	assertEquals("zero", numberToWordConversionTest.convertNumberToWord(0), "zero");
    	assertEquals("ninety", numberToWordConversionTest.convertNumberToWord(90), "ninety");
    	
	}

}
