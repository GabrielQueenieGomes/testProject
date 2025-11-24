package com.cucumber.bdd.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	WebDriver driver;
	@Given("open chrome")
	public void open_chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("go to app link")
	public void go_to_app_link() {
		driver.get(
				"file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
	}

	
	
	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		try {
	        Thread.sleep(3000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	@Then("Check login pass or failed")
	public void check_login_pass_or_failed() {
			
		try {
			Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
			System.out.println("Log out button there or not = " + status);
		} catch (Exception e) {
			
		}
	driver.quit();
	}

	
		
	@Then("login fails and no logout button")
	public void login_fails_and_no_logout_button() {
		try {
			Boolean status = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
			System.out.println("Log out button there or not = " + status);
		} catch (Exception e) {
			
		}
	driver.quit();
	}

@Given("open any browser")
public void open_any_browser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@Given("go to application")
public void go_to_application() {
	driver.get(
			"file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
}

@When("enter user {string}")
public void enter_user(String user) {
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys(user);
}

@When("enter pass {string}")
public void enter_pass(String pass) {
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
}


	
}
