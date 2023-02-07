package www.MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MyproStepDefinition extends BaseFrame {

//PojoMyproject p = new PojoMyproject();

@Given("to launch chrome")
public void to_launch_chrome() {
   openChromeBrowser();
   Implicitwait(10);
   maxWindow();

   }

@Given("to launch ubuy url")
public void to_launch_ubuy_url() {
   launchurl("https://www.ubuy.dk/en/");
   
}
@Given("to clear popup")
public void to_clear_popup() {
	try {
		PojoMyproject p = new PojoMyproject();
		  p.getPopUp().click();
	} 
	catch (Exception e) {
System.out.println("exception handled");
	}
	
}
//@Given("to clear ndpopup")
//public void to_clear_ndpopup() {
//	try {
//		PojoMyproject p = new PojoMyproject();
//	    p.getNdpopUp().click();
//		
//	} 
//	catch (Exception e) {
//		System.out.println("2nd exception handled");
//	}
//	
//}



@When("to enter product in search box")
public void to_enter_product_in_search_box() {
	PojoMyproject p = new PojoMyproject();
	p.getSearchBox().click();
	fillTextBox(p.getSearchBox(), "Mobile Phones");
}

@When("to enter the search button")
public void to_enter_the_search_button() {
	PojoMyproject p = new PojoMyproject();
    toClickButton(p.getClickButton());
}

@When("to ensure user in correct page")
public void to_ensure_user_in_correct_page() {
  String currentUrl = driver.getCurrentUrl();
  if (currentUrl.contains("?q=Mobile+Phones")) {
	  System.out.println("User in correct Page");
	
}
  else {
	System.err.println("user is incorrect Page");
}
}

@When("to click the first product")
public void to_click_the_first_product() {
  List<WebElement> products = driver.findElements(By.xpath("//div[@class=\"product-card uc\"]"));
  WebElement firstProduct = products.get(0);
  firstProduct.click();
  
}

@When("to switch next window")
public void to_switch_next_window() {
   Set<String> windowId = driver.getWindowHandles();
   List<String>allWindowId= new ArrayList<>(windowId);
   driver.switchTo().window(allWindowId.get(1));
}



@When("to ensure user is correct window")
public void to_ensure_user_is_correct_window() {
	String currentUrl = driver.getCurrentUrl();
	  if (currentUrl.contains("-google-pixel-6a-5g")) {
		  System.out.println("User in correct Page");
		
	}
	  else {
		System.err.println("user is incorrect Page");
	}
}
//@When("to Select Quantity")
//public void to_Select_Quantity() {
//   WebElement quantity = driver.findElement(By.xpath("//div[contains(@Class,'quantity')]//div//following-sibling::select"));
//   dropDown(quantity, "2");
//}


@When("to click AddToCart button")
public void to_click_AddToCart_button() {
	
    WebElement addToCartbtn = driver.findElement(By.xpath("//div[contains(@Class,'add-to-')]//div//button[contains(@id,'add-to')]"));
    toClickButton(addToCartbtn);
}

//@When("to take ScreenShot")
//public void to_take_ScreenShot() {
//   
//}

@When("to check view cart")
public void to_check_view_cart() {
    WebElement clkbtn = driver.findElement(By.xpath("//a[text()='View Cart & Checkout']"));
    clkbtn.click();
}


	
	
}
