package com.qa.datatypes;

public class DataTypes {
 
	public static void main(String[] args) {
		// What data types do we know in Java????
 
 
		// Primitives 
 
		// int
		// char
		// byte
		// boolean
		// short
		// long
		// float
		// double
 
		// Lets see them in action -
 
		//Booleans are essentially a 0 or 1. A true or false.
		boolean amILying = false;
 
		boolean amIHungry = true;
 
		// camel Case oneTwoThree
 
 
		// 8 Bit byte - in Binary this would look like 00001010 - ranges from 127 - 128
		byte theNumberOne = 1;
		byte theNumberTwo = 2;
		System.out.println(theNumberOne + theNumberTwo);
 
		// char is essentially a letter - It is the raw primitive for all Strings,
		// Situationally used, for example for grading school work- Grade A, B, C, etc.
		char ch = 'c';
 
		System.out.println(ch);
 
		//short - 16 bit Similar to the byte but storage is much greater
		// range from -32768 to 32767
		short shorty = 10;
 
		// int - 32 bit. Range -2147483648 to 2147483647
 
		int iAmAnInt = 1000000;
 
		// Long - 64 bit longest integer type available -922337206854775808 to 922337206854775807
		// it is best practise to place a capital L at the end of the number
 
		long reallyLongNumber = 2022893802204L;
 
		//float - The first of the decimals. Range: 32 bit 3.4e +/- 38(7 digits) (Thats really big)
		// like long, numbers must end in a small f 
 
 
		float floatingOnCloudNine = 200.20f;
 
		double thisIsADouble = 200000.20d;
 
 
 
		// A String is a weird case: Lets examine 
	    String name = "Bob";
 
	    name.toUpperCase();
 
 
 
	}
}
 