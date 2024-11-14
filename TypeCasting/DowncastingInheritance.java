package com.src.TypeCasting;

	
	class Vehicle {
	    public void drive() {
	        System.out.println("Vehicle is driving");
	    }
	}

	class Car extends Vehicle {
	    public void honk() {
	        System.out.println("Car is honking");
	    }
	}

	public class DowncastingInheritance {
	    public static void main(String[] args) {
	        // Upcasting
	        Vehicle vehicle = new Car();

	        // Downcasting 
	        Car car = (Car) vehicle;
	        car.honk(); // Calls Car's honk method

	        // Another example of downcasting directly
	        Car anotherCar = (Car) vehicle;
	        anotherCar.honk(); // Calls Car's honk method
	    }
	}


