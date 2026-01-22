package com.cucumber.pw;

public abstract class AbstractPractice { // overriding
int a = 10;
	static final int b = 20;
	public void getAccount() {
		
	}
	
	public abstract void getMoney(); // unimplemented = detail process hidden
	public abstract void getSalary();
	public abstract void getMoney(String a, int b);
	public abstract void getSalary(double c, boolean d);
}
