package com.interview.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClick {

	public void getClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/popup.php"); // 1st window
		// open 5 new window	>> total = 6
		WebElement clickBtn = driver.findElement(By.xpath("//*[text()='Click Here']"));
		
		for(int i=0;i<5;i++) {
			clickBtn.click(); // 2nd > 3rd > 4th >> 5th > 6th
		}
		
		//write "Hi" in 3rd 
		//find 3rd
		
		String parentWindow = driver.getWindowHandle(); // parent/1st
		System.out.println("Parent window = " + parentWindow);
		Set<String> allWindows = driver.getWindowHandles(); // all total = 6
		// to find each value need setName.get(index) >> set has no get() method
		// two options ==> 1) convert set to List(has get())
		// 2) use Enhance for loop
		// write "hi" in 3rd child
		int count = 0;
		for(String eachWindow: allWindows) {
			System.out.println("All windows = " + eachWindow);
			// 3rd child count = P + 3C = 4
			
			if(!eachWindow.equals(parentWindow)) { // only child
				if(count == 4) {
					driver.switchTo().window(eachWindow);
					driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("hi");
				}
				
				count++; // 4 = P + 3C
			}
			
			
		} // end loop
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumClick obj = new SeleniumClick();
		obj.getClick();

	}

}
