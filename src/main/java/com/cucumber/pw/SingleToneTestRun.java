package com.cucumber.pw;

public class SingleToneTestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleToneDesignPattern stdp = new SingleToneDesignPattern();
		stdp.a = 40;
		stdp.b = 60;
		SingleToneDesignPattern.c = 70;
		SingleToneDesignPattern.d = 80;
		
		System.out.println(stdp.a);
		System.out.println(stdp.b);
		System.out.println(SingleToneDesignPattern.c);
		System.out.println(SingleToneDesignPattern.d);
		stdp.getAccount();
		System.out.println(stdp.salary);
	}
	
}
