     
public class DFSEexercise {
 
	public static void main(String[] args) {
 
		boolean isEdselHappy = true; //
 
		int weight = 20; // In this line, weight is being stored as and int with value 20 
		String name = "Billy Bob"; // Creating a new variable
		Dog goodBoy = new Dog(name, weight); // Object (Another class)
		int x = weight - 10; // creating a new variable
		if (x < 15) goodBoy.bark(); // checking if meets parameters then calls a method if it does
 
		while (x < 3) { // Keeps running until conditions are met
			goodBoy.play(); // this method keeps getting called until while loop is broken
		}
 
		int[] numList = {1,2,3,4,5,6}; // Creates an array of numbers
		System.out.println("How are you");
		System.out.println("My " + name + " is doing great"
				+ " how's yours");
		String num = "305"; // creating a variable
		int z = Integer.parseInt(num);
		
 
 
 
	}
 
 
	}