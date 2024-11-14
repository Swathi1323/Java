package com.src.TypeCasting;

	
	
	class Animal {
	    public void sound() {
	        System.out.println("Some generic animal sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Woof");
	    }
	}

	public class UpcastingInheritance {
	    public static void main(String[] args) {
	        // Example 1
	        Animal animal = new Dog(); // Upcasting
	        animal.sound(); // Calls Dog's sound method

	        // Example 2
	        Dog dog = new Dog();
	        Animal anotherAnimal = dog; // Upcasting
	        anotherAnimal.sound(); // Calls Dog's sound method
	    }
	}




