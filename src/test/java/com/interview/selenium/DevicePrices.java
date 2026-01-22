package com.interview.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevicePrices {
	
	public void getPrices() {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.demoblaze.com/");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    // WAIT FIRST
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
	            By.xpath("//div[@class='card-block']//h5")));

	    // THEN FIND ELEMENTS
	    List<WebElement> productPrice =
	            driver.findElements(By.xpath("//div[@class='card-block']//h5"));

	    List<Integer> myList = new ArrayList<>();

	    for (WebElement price : productPrice) {
	        String priceText = price.getText().replace("$", "");
	        int value = Integer.parseInt(priceText);
	        myList.add(value);
	        System.out.println("Price = " + value);
	    }

	    System.out.println("All prices: " + myList);

	    // SORT
	    Collections.sort(myList);

	    int min = myList.get(0);
	    int secondMin = myList.get(1);
	    int thirdMin = myList.get(2);

	    int max = myList.get(myList.size() - 1);
	    int secondMax = myList.get(myList.size() - 2);
	    int thirdMax = myList.get(myList.size() - 3);

	    System.out.println("Max price = " + max);
	    System.out.println("2nd max price = " + secondMax);
	    System.out.println("3rd max price = " + thirdMax);

	    System.out.println("Min price = " + min);
	    System.out.println("2nd min price = " + secondMin);
	    System.out.println("3rd min price = " + thirdMin);

	    driver.quit();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DevicePrices obj = new DevicePrices();
			obj.getPrices();
		}
	}