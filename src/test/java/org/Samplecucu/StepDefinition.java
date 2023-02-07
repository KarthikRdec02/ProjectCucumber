package org.Samplecucu;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseFrame {

	
	


	@When("Have to enter valid user name and invalid password")
	public void have_to_enter_valid_user_name_and_invalid_password() {
		WebElement textemil = driver.findElement(By.id("email"));
		fillTextBox(textemil, "karthik r");
		WebElement textpass = driver.findElement(By.id("pass"));
		fillTextBox(textpass, "12358496");

	}

	@When("Have to click login button")
	public void have_to_click_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.name("login"));
		toClickButton(login);
		Thread.sleep(5000);
	}

	@Then("Ensure User have to be in incorrect page")
	public void ensure_User_have_to_be_in_incorrect_page() {
		String cururl = driver.getCurrentUrl();
		if(cururl.contains("?privacy_mutation_token")) {
			System.out.println("Ensure User have to be in incorrect page");
		}
	}

	@When("Have to enter {string} and {string}")
	public void have_to_enter_and(String v1, String v2) {
		WebElement textemil = driver.findElement(By.id("email"));
		textemil.sendKeys(v1);
		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys(v2);

	}
	@Given("user have to enter in login page")
	public void user_have_to_enter_in_login_page() {
		launchurl("https://www.facebook.com/");

	}
	@Given("Have to enter fb login page")
	public void have_to_enter_fb_login_page() {
		launchurl("https://www.facebook.com/");

	}

	@When("user have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
		WebElement textemil = driver.findElement(By.id("email"));
		fillTextBox(textemil, "karthiktaM");
		WebElement textpass = driver.findElement(By.id("pass"));
		fillTextBox(textpass, "12358496");
	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.name("login"));
		toClickButton(login);
		Thread.sleep(5000);
	}

	@Then("ensure user has to be in incorrect page")
	public void ensure_user_has_to_be_in_incorrect_page() {
		String cururl = driver.getCurrentUrl();
		if(cururl.contains("?privacy_mutation_token")) {
			System.out.println("Ensure User have to be in incorrect page");
	}
	}
	@When("user have to enter invalid email and valid password")
	public void user_have_to_enter_invalid_email_and_valid_password() {
		WebElement textemil = driver.findElement(By.id("email"));
		fillTextBox(textemil, "Dhamo");
		WebElement textpass = driver.findElement(By.id("pass"));
		fillTextBox(textpass, "12uyres496");
	}

	@When("user have to enter invalid email and invalid valid password")
	public void user_have_to_enter_invalid_email_and_invalid_valid_password() {
		WebElement textemil = driver.findElement(By.id("email"));
		fillTextBox(textemil, "bala");
		WebElement textpass = driver.findElement(By.id("pass"));
		fillTextBox(textpass, "12Exy96");
	}

}
