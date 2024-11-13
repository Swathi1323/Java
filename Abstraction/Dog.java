package com.src.Abstraction;

public class Dog extends Animal {
	
	 @Override
	   public void eat() {
	        System.out.println("Dog eats bones.");
	    }

	    @Override
	   public void sleep() {
	        System.out.println("Dog sleeps in a kennel.");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Dog barks.");
	    }
	}



