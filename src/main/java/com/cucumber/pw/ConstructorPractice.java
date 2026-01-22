package com.cucumber.pw;

public class ConstructorPractice {

	String name;
	
public ConstructorPractice(String name) { // parameterized constructor
		this.name = name;
	}

public void getRun() {
	System.out.println(name.concat(" Gomes"));
}

public static void main(String[] args) {
	ConstructorPractice obj = new ConstructorPractice("Gabriel");
	obj.getRun();
}

}
