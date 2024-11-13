package com.src.Abstraction;

public class AbstractRunner {
	// Main Class
		public class Main {
		    public static void main(String[] args) {
		        // Creating objects of each implementation class
		        Animal dog = new Dog();
		        Animal cat = new Cat();
		        Animal bird = new Bird();

		        // Invoking methods for Dog
		        System.out.println("Dog:");
		        dog.info();
		        dog.eat();
		        dog.sleep();
		        dog.sound();

		        System.out.println("\nCat:");
		        // Invoking methods for Cat
		        cat.info();
		        cat.eat();
		        cat.sleep();
		        cat.sound();

		        System.out.println("\nBird:");
		        // Invoking methods for Bird
		        bird.info();
		        bird.eat();
		        bird.sleep();
		        bird.sound();
		    }
		}


}
