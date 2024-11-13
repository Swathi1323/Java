package com.src.Abstraction;

public class Bird extends Animal{
	
	 @Override
	    public void eat() {
	        System.out.println("Bird eats seeds.");
	    }

	    @Override
	   public void sleep() {
	        System.out.println("Bird sleeps in a nest.");
	    }

	    @Override
	    public void sound() {
	        System.out.println("Bird chirps.");
	    }

}
