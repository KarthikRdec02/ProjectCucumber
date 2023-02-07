package org.AustraliaProject;

import java.util.List;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AusStepDefinition extends BaseFrame {

	@Given("to open chrome")
	public void to_open_chrome() {
		openChromeBrowser();
	}

	@Given("to give wait and max window")
	public void to_give_wait_and_max_window() {
		maxWindow();
		Implicitwait(10);
	}

	@When("to open project")
	public void to_open_project() {
		launchurl("https://www.identitydirect.com.au/");
	}

	@When("to search produt")
	public void to_search_produt() {
		PojoAusProject p = new PojoAusProject();
		fillTextBox(p.getSearchox(), "toys");
	}

	@When("to click popup")
	public void to_click_popup() {
		try {
			driver.findElement(By.xpath("//div[@class='cLdCP']")).click();

		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	@When("to select first product wishlist")
	public void to_select_first_product_wishlist() {
	PojoAusProject p=new PojoAusProject();
	p.getAddFirstProductWishList().get(1).click();

//		List<WebElement> wishlist = driver.findElements(By.xpath("//div[text()='Add product to Wishlist']"));
//		wishlist.get(0).click();

	}

	@When("to click first product")
	public void to_click_first_product() {
		PojoAusProject p = new PojoAusProject();
		p.getSelectFirstProduct().get(1).click();
	}

	@When("to select first product Addtocart")
	public void to_select_first_product_Addtocart() {
		// driver.findElement(By.xpath("//span[text()='Add To Cart']")).click();
		PojoAusProject p = new PojoAusProject();
		p.getAddFirstProductInCart();
	}

}
