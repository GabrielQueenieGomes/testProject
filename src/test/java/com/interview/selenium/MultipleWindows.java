package com.interview.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public void getWindows() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/popup.php"); // 1st window
		
		WebElement clickBtn=driver.findElement(By.xpath("//*[text()='Click Here']"));
		clickBtn.click();
		clickBtn.click();
		clickBtn.click();
		clickBtn.click();
		clickBtn.click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> mylist = new ArrayList<>(allWindows);
		int count = 0;
		for(int i = 0; i < mylist.size(); i++) {
			// each window from all = mylist.get(i)
			if(!mylist.get(i).equals(parentWindow)) { // remove parent
				// all child
				if(count == 4) {
					driver.switchTo().window(mylist.get(i));
					driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("Hi");
				}
				
				count++;
			} // end child condition
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindows obj = new MultipleWindows();
		obj.getWindows();

	}

}
