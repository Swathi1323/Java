package com.src.Encapsulation;

public class Person {
	    // Variables
	    private String name;
	    private int age;
	    private String gender;
	    private String address;
	    private long phoneNumber;
	    private String email;
	    private String nationality;
	    private String occupation;
	    private double height;
	    private double weight;
	    private String maritalStatus;
	    private String bloodGroup;
	    private String eyeColor;
	    private String hairColor;
	    private String birthDate;
	    private String education;
	    private String favoriteFood;
	    private String favoriteHobby;
	    private String favoriteColor;
	    private String favoriteBook;

	    // Constructor
	    public Person(String name, int age, String gender,String address,long phoneNumber,String email,String nationality,String occupation,double height,double weight,String maritalStatus,String bloodGroup,String eyeColor,String hairColor,String birthDate,String education,String favoriteFood,String favoriteHobby,String favoriteColor,String favoriteBook) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.address=address;
	        this.phoneNumber=phoneNumber;
	        this.email=email;
	        this.nationality=nationality;
	        this.occupation=occupation;
	        this.height=height;
	        this.weight=weight;
	        this.maritalStatus=maritalStatus;
	        this.bloodGroup=bloodGroup;
	        this.eyeColor=eyeColor;
	        this.hairColor=hairColor;
	        this.birthDate=birthDate;
	        this.education=education;
	        this.favoriteFood=favoriteFood;
	        this.favoriteHobby=favoriteHobby;
	        this.favoriteColor=favoriteColor;
	        this.favoriteBook=favoriteBook;
	    }

	    // Method 1: Display basic information
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	    }

	    // Method 2: Calculate BMI
	    public double calculateBMI() {
	            double bmi = weight / (height * height);
	            return bmi;
	        }
	        

	    // Method 3: Check if the person is an adult
	    public void isAdult() {
	       System.out.println("Is adult");
	    }
	    
	    //getters
	    public String getName()
	    {
	    	return name;
	    }
	    public int getAge()
	    {
	    	return age;
	    }
	    public String getGender()
	    {
	    	return gender;
	    }
	    public String getAddress()
	    {
	    	return address;
	    }
	    public long getNumber()
	    {
	    	return phoneNumber;
	    }
	    public String getEmail()
	    {
	    	return email;
	    }
	    public String getNationality()
	    {
	    	return nationality;
	    }
	    public String getOccupation()
	    {
	    	return occupation;
	    }
	    public double getHeight()
	    {
	    	return height;
	    }
	    public double getWeight()
	    {
	    	return weight;
	    }
	    public String getMaritalStatus()
	    {
	    	return maritalStatus;
	    }
	    public String getBloodGroup()
	    {
	    	return bloodGroup;
	    }
	    public String getEyeColor()
	    {
	    	return eyeColor;
	    }
	    public String getHairColor()
	    {
	    	return hairColor;
	    }
	    public String getbirthDate()
	    {
	    	return birthDate;
	    }
	    public String getEducation()
	    {
	    	return education;
	    }
	    public String getFavoriteFood()
	    {
	    	return favoriteFood;
	    }
	    public String getFavoriteHobby()
	    {
	    	return favoriteHobby;
	    }
	    public String getFavoriteColor()
	    {
	    	return favoriteColor;
	    }
	    public String getFavoriteBook()
	    {
	    	return favoriteBook;
	    }
	    
	    //setters
	    public void setName(String name)
	    {
	    	this.name=name;
	    }
	    public void setAge(int age)
	    {
	    	this.age=age;
	    }
	    public void setgender(String gender)
	    {
	    	this.gender=gender;
	    }
	    public void setAddress(String address)
	    {
	    	this.address=address;
	    }
	    public void setphoneNumber(long phoneNumber)
	    {
	    	this.phoneNumber=phoneNumber;
	    }
	    public void setEmail(String email)
	    {
	    	this.email=email;
	    }
	    public void setNationality(String nationality)
	    {
	    	this.nationality=nationality;
	    }
	    public void setOccupation(String Occupation)
	    {
	    	this.occupation=occupation;
	    }
	    public void setWeight(double weight)
	    {
	    	if(weight>0)
	    	{
	    	this.weight=weight;
	    }
	    }
	    public void setHeight(double height)
	    {
	    	if(height>0)
	    	{
	    	this.height=height;
	    }
	    }
	    public void setMaritalStatus(String maritalStatus)
	    {
	    	this.maritalStatus=maritalStatus;
	    }
	    public void setBloodGroup(String bloodGroup)
	    {
	    	this.bloodGroup=bloodGroup;
	    }
	    public void setEyeColor(String eyeColor)
	    {
	    	this.eyeColor=eyeColor;
	    }
	    public void setHairColor(String hairColor)
	    {
	    	this.hairColor=hairColor;
	    }
	    public void setBirthDate(String birthDate)
	    {
	    	this.birthDate=birthDate;
	    }
	    public void setEducation(String education)
	    {
	    	this.education=education;
	    }
	    public void setFavoriteFood(String favoriteFood)
	    {
	    	this.favoriteFood=favoriteFood;
	    }
	    public void setFavoriteHobby(String favoriteHobby)
	    {
	    	this.favoriteHobby=favoriteHobby;
	    }
	    public void setFavoriteColor(String favoriteColor)
	    {
	    	this.favoriteColor=favoriteColor;
	    }
	    public void setFavoriteBook(String favoriteBook)
	    {
	    	this.favoriteBook=favoriteBook;
	    }
	    
        
}
