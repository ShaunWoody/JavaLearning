package com.qa.datatypes;

public class FoodExercise {

	public static void main(String[] args) {
		
		float total = 10f;
		
		Food carrot = new Food("Carrot",0.50f,10);
				
		total = carrot.buyItem(total);
		System.out.println(total);
		
		System.out.println(carrot.checkStock(carrot.quantity));
		
		carrot.printItem();

	}

}
