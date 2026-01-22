package com.cucumber.pw;

public class TestRun extends JavaPractice { // inheritance

	public static void main(String[] args) {
		TestRun obj = new TestRun();
		obj.getMoney();
		
		JavaPractice jp = new JavaPractice();
		jp.getSalary();
		
		JavaPractice jp2 = new TestRun();
		jp2.getMoney();
	}
}
