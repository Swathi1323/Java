package com.src.Encapsulation;

public class PersonRunner {
	public static void main(String[] args)
	{
		Person person=new Person("Swathi",23,"Female","Kasaragod",8113822,"swathinairudma@gmail.com","Indian","Student",130,56,"single","O+ve","black","Black","23/10/2001","MCA","Mandhi","Singing","Pink","Aadujeevitham");
		Person person1=new Person("Nandu",24,"Male","Chowki",628206,"shivanandnairudma@gmail.com","Indian","Student",160,76,"Single","O+ve","brown","black","13/11/2000","MCA","Biriyani","dancing","red","Randamoozham");
		System.out.println(person.getNumber());
		person.setAddress("Kerala");
		System.out.println(person.getAddress());
		person1.setphoneNumber(944676);
		System.out.println(person1.getName());
		System.out.println(person1.getNumber());
		person.setAge(0);
		System.out.println(person1.getAge());
		
		
		}

}
