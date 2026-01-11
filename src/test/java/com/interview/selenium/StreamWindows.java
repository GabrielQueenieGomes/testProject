package com.interview.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamWindows {

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
		
		allWindows.stream().skip(3).forEach(i -> {
			driver.switchTo().window(i);
			driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
			
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamWindows obj = new StreamWindows();
		obj.streamWindows();

	}

}
