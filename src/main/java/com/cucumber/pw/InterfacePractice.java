package com.cucumber.pw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface InterfacePractice {

	public void getRun();
	int a = 10; // literal = container that holds data, static final by default
	public void getValue(); // abstract by default
	// upcasting
	WebDriver driver = new ChromeDriver();
	List<String> myList = new ArrayList<>();
	// typecasting
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Alert arl = driver.switchTo().alert();
	double b = 2.75;
	char c = 'h';
	boolean condition = true;
	String name = new String("Gabriel"); // usually class in heap, but final behavior results in pool

}
