package com.acme.testing;

import com.acme.utils.ConversionService;

/**
*
* @author mattpinkerton
*/
public class TestConversionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(30));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(50));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(7.7));

		// explicit casting
		ConversionService.fluidOunces((float)1.1);
		ConversionService.grams((int)30L);
		ConversionService.milliliters((int)4.0);
		short grams = (short)ConversionService.grams(30);
		byte byteGrams = (byte)ConversionService.grams(30);
		
		// implicit casting
		System.out.println("------------------------------------");
		// upcast from returning float to double is implicit
		double ounces = ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		// upcast from returning int to long is implicit
		long milliliters = ConversionService.milliliters(40);
		System.out.println(milliliters);
		// upcast from returning int to double is implicit
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);
		// upcast from short to int is implicit
		short s = 30;
		System.out.println(ConversionService.grams(s));
		// upcast from byte to int is implicit
		byte b = 4;
		System.out.println(ConversionService.milliliters(b));
		// cast from char to int is implicit
		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		// cast from int to float is allowed and is implicit (but may lose precision)
		System.out.println(ConversionService.gallons(200));
		// upcast from float to double is implicit
		System.out.println(ConversionService.ounces(50.5f));
		// cast from long to float is allowed and is implicit (but may lose precision)
		System.out.println(ConversionService.pints(6L));
		// cast from long to double is allowed and is implicit (but may lose precision)
		System.out.println(ConversionService.pounds(7L));
		
		System.out.println("------------------------------------");
		// precision is lost due to working large numbers and float type
		float bigGallons = ConversionService.gallons(123456789123456789L);
		System.out.println(bigGallons);
		// precision is retained due to working with doubles and large numbers
		double bigGallons2 = 123456789123456789L * 0.2642;
		System.out.println(bigGallons2);
		
		System.out.println("------------------------------------");
		// precision is lost due to multiplying 2 ints
		int bigGrams = ConversionService.grams(1234567890);
		System.out.println(bigGrams);
		// precision is maintained using longs
		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);
		
	}

}
