package com.interview.selenium;

// import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamWindows {

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
	          .forEach(win -> {
	              driver.switchTo().window(win);

	              System.out.println("Window title: " + driver.getTitle());

	              driver.findElement(By.name("emailid"))
	                    .sendKeys("Hi");
	          });

	    driver.quit();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamWindows obj = new StreamWindows();
		obj.streamWindows();

	}

}
