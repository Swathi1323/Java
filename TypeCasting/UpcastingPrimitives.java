package com.src.TypeCasting;

public class UpcastingPrimitives {
	
	    public static void main(String[] args) {
	        // Example 1: byte to int
	        byte smallByte = 10;
	        int largeInt = smallByte; // Upcasting
	        System.out.println("Upcasting byte to int: " + largeInt);

	        // Example 2: int to double
	        int num = 100;
	        double decimalNum = num; // Upcasting
	        System.out.println("Upcasting int to double: " + decimalNum);

	        // Example 3: char to int
	        char letter = 'A';
	        int letterCode = letter; // Upcasting
	        System.out.println("Upcasting char to int: " + letterCode);

	        // Example 4: float to double
	        float floatNum = 3.14f;
	        double doubleNum = floatNum; // Upcasting
	        System.out.println("Upcasting float to double: " + doubleNum);
	    }
	}


