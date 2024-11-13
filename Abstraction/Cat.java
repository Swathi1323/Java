package com.src.Abstraction;

public class Cat extends Animal {
	@Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps on the couch.");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}


