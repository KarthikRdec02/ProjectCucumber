package org.fbCreatracc;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookAccCreate extends BaseFrame {
	@Given("to open chrome browser")
	public void to_open_chrome_browser() {
	   openChromeBrowser();
	}

	@Given("to maximize window")
	public void to_maximize_window() {
	    maxWindow();
	    Implicitwait(10);
	}

	@When("to launch FB url")
	public void to_launch_FB_url() {
	   launchurl("https://www.facebook.com/");
	}

	@When("to pass username and password")
	public void to_pass_username_and_password() {
		WebElement userName = driver.findElement(By.cssSelector("#email"));
		
		fillTextBox(userName, "Karthik");
		
		
		
//	    driver.findElement(By.id("emal")).sendKeys("karthik");
//	    driver.findElement(By.id("pass")).sendKeys("123665548");
	}

	@When("to click create new account")
	public void to_click_create_new_account() {
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}

	@Then("to close tab")
	public void to_close_tab() {
	   //closeCurrentTab();
	}

}
