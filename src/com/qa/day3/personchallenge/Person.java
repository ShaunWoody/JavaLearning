package com.qa.day3.personchallenge;

public class Person {
	
	private String name;
	private int age;
	private String jobtitle;
	
	
	
	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;
	}

	
	public String getName() {
		return name;
	}




	@Override
	public String toString() {
		return "Name: " + name + " | Age: " + age + " | Job Title: " + jobtitle;
	}
	
	
	
	
	
	
}
