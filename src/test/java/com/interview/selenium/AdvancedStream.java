package com.interview.selenium;

// import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedStream {

	public void streamWindows() {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/popup.php");

	    WebElement clickBtn = driver.findElement(By.xpath("//*[text()='Click Here']"));

	    for (int i = 0; i < 5; i++) {
	        clickBtn.click();
	    }

	    String parentWindow = driver.getWindowHandle();

	    driver.getWindowHandles().stream()
	            .filter(win -> !win.equals(parentWindow))
	            .forEach(child -> {
	                driver.switchTo().window(child);
	                System.out.println("Child window title: " + driver.getTitle());

	                driver.findElement(By.name("emailid"))
	                      .sendKeys("test@example.com");
	            });

	    driver.switchTo().window(parentWindow);
	    driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedStream obj = new AdvancedStream();
		obj.streamWindows();

	}

}
