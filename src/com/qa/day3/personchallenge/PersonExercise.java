package com.qa.day3.personchallenge;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersonExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] addpeople = { new Person("Megan", 31, "Accountant"), new Person("Sarah", 40, "Director"),
				new Person("Bob", 26, "Manager"), new Person("James", 20, "Sales Assistant") };

		PersonList myList = new PersonList();
		Scanner input = new Scanner(System.in);

		myList.addPerson(addpeople);



		while (true) {
			
			System.out.println("1. To search for someone \n2. To list all\n3. To Exit");

			String x = input.next();
			
			switch (x) {
			case "1":
				System.out.println("Enter name you want to search: ");
				String nameinput = input.next();
				myList.getPersonFromList(nameinput);
				break;

			case "2":
				myList.getAll();
				break;
				
			case "3":
				break;
				
			default:
				System.out.println("Not an option!");
				break;
			}
			
			if (x.equals("3"))
			{
				System.out.println("Bye!");
				break;
			}

		}
	}

}
