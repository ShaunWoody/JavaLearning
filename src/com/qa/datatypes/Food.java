package com.qa.datatypes;

//This exercise is all about you
//I want you to create your own class('s) and it can be anything that you want!
//Breakout room + Peer Programming is highly encouraged.
//I want you to have at least 5 different variables, all preferably a different
//data type.
//Additionally I want you to create three different methods (Not Including the
//Constructor)!
//Think outside the box for these methods and over achieve - go beyond the lessons
//if you so dare. I want to be impressed.
//I will give you 30 mins to complete this - After this I would like people to demonstrate
//what they were able to create

public class Food {

	String name;
	float price;
	int quantity;
	boolean instock = true;
	
	
	public Food(String name, float price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
 
	}

	public boolean checkStock(int quantity) {
		if (quantity > 0) {
			return true;
		}

		else
			return false;

	}

	public float buyItem(float total) {

		float value = total - price;
		

		return value;
	}
	
	
	public void printItem() {
		System.out.println(name + " " + price + " " + quantity);
	}

}
