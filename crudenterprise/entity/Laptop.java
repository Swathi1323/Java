package com.xworkz.crudenterprise.entity;

public class Laptop {
	
	    private String brand;
	    private int ramSize; 
	    private int storage; 
	    private int price;
	    private String color;

	    public Laptop(String brand, int ramSize, int storage, int price, String color) {
	        this.brand = brand;
	        this.ramSize = ramSize;
	        this.storage = storage;
	        this.price = price;
	        this.color = color;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public int getRamSize() {
	        return ramSize;
	    }

	    public void setRamSize(int ramSize) {
	        this.ramSize = ramSize;
	    }

	    public int getStorage() {
	        return storage;
	    }

	    public void setStorage(int storage) {
	        this.storage = storage;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void printDetails() {
	        System.out.println("********************************");
	        System.out.println("Brand Name: " + brand);
	        System.out.println("RAM Size: " + ramSize + "GB");
	        System.out.println("Storage: " + storage + "GB");
	        System.out.println("Price: " + price);
	        System.out.println("Color: " + color);
	    }
	}



