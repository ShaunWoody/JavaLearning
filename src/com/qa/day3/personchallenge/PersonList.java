package com.qa.day3.personchallenge;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

	List<Person> personList = new ArrayList<>();

	public void addPerson(Person[] person) {

		for (int i = 0; i < person.length; i++) {
			personList.add(person[i]);
		}

	}

	public void getPersonFromList(String name) {

		
		boolean foundname = false;
		
		for (Person i : personList) {

			if (i.getName().equalsIgnoreCase(name)) {
				System.out.println(i.toString());
				foundname = true;
			}
		}
		
		if(foundname == false) {
			System.out.println("There is no " + name);
		}

	}

	public void getAll() {

		for (Person i : personList) {

			System.out.println(i.toString());

		}

	}

	public List<Person> getPersonList() {
		return personList;
	}

}