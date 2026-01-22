package com.cucumber.pw;

public class JavaPractice { // non-primitive data type, heap, mutable

	int a = 24;
	static String name = "Queenie"; // literal variable >> pool, dominant, String final, immutable
	String firstName = new String("Gabriel"); // class variable >> heap, mutable, non-primitive\
	// Integer k = new Integer(); << wrapper class, heap, mutable
	int[] k = {10, 20};
	double[] e = {2.75, 3.45};
	Object employee = "Ahmed";
	Object abc = 15;
	Object def = 2.45; // old-style parent of all data types, class-level, heap
	String[] govtName = {"Gabriel", "Queenie", "Gomes"};
	// Practice obj = new Practice();
	static boolean status;
	
	public JavaPractice() { // constructor, similar to method
		
	}
	
	public void getSalary() {
		System.out.println(a);
		System.out.println("void method");
		System.out.println(name.concat(" Gomes"));
		a = 20; // pool, immutable once a value is fixed, but only mutable inside inner class code?
	}
	
	public void getSalary(int c) {
		c = 30;
		var e = 18; // similar to Object, but can't work outside of methods
		System.out.println(e);
	}
	
	public int getMoney() {
		return 10;
	}
	
	public void getMoney(int b, double d) { // overloading polymorphism
		
	}
	
	public static void main(String[] args) {
		System.out.println(status);
		JavaPractice obj = new JavaPractice();
		obj.getSalary();
	}

	static class Interview{
		
	}
}
