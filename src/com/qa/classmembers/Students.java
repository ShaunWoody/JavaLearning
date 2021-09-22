package com.qa.classmembers;

public class Students {
	
	String name = "bob";
	byte age = 10;
	double height;
	long studentid = (long)(Math.random()* 100000000);
	boolean highiq = false;
	
	
	
	public void doHomeWork() {
		System.out.println("Im doing my homework");
	}
	
	public int addNumbers(int x,int y) {
		int z = x + y;
		System.out.println(z);
		
		return z;
	}

}
