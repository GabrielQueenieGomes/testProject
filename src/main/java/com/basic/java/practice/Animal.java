package com.basic.java.practice;

public class Animal {
	static int a;
	static double b;
	static String name;
	static Boolean status;
	
	public Animal (String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		Animal obj = new Animal("Motin");
		System.out.println(name);
		System.out.println(status);
	}
}
