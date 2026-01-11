package com.interview.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedStream {

	public void streamWindows() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/popup.php"); // 1st window
		
		WebElement clickBtn = driver.findElement(By.xpath("//*[text()='Click Here']"));
		clickBtn.click();
		clickBtn.click();
		clickBtn.click();
		clickBtn.click();
		clickBtn.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles(); // 3rd c = P + 3C = 4
		// For each work = array + Collection framework (List, Set, Map)
		allWindows.stream().skip(3).forEach(child -> {
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
			
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedStream obj = new AdvancedStream();
		obj.streamWindows();

	}

}
