package com.src.TypeCasting;

public class DowncastingPrimitives {
	
	    public static void main(String[] args) {
	        // Example 1: double to int
	        double largeDouble = 100.99;
	        int smallInt = (int) largeDouble; // Downcasting
	        System.out.println("Downcasting double to int: " + smallInt);

	        // Example 2: int to byte
	        int bigNumber = 130;
	        byte smallByte = (byte) bigNumber; // Downcasting
	        System.out.println("Downcasting int to byte: " + smallByte);

	        // Example 3: long to short
	        long largeLong = 50000;
	        short smallShort = (short) largeLong; // Downcasting
	        System.out.println("Downcasting long to short: " + smallShort);

	        // Example 4: float to int
	        float largeFloat = 123.45f;
	        int smallerInt = (int) largeFloat; // Downcasting
	        System.out.println("Downcasting float to int: " + smallerInt);
	    }
	}


