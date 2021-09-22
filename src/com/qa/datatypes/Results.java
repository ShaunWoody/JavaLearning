package com.qa.datatypes;

public class Results {
	
	int physics = 50 ;
	int chemistry = 50;
	int biology = 50;
	int total;
	float percentage;
	
	
	public void displayResults() {
		total = physics + chemistry + biology;
		System.out.println("Physics:" + physics + "\n Chemistry:" + chemistry + "\n Biology: " + biology + "\n Total:" + total);
	}
	
	
	
	public double findPercentage() {
		return 0;
	}

}
