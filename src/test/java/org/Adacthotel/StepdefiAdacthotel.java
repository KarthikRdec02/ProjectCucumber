package org.Adacthotel;

import java.io.IOException;
import java.util.List;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import gherkin.ast.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepdefiAdacthotel extends BaseFrame {

	@Given("to enter the adactin hotel booking login page")
	public void to_enter_the_adactin_hotel_booking_login_page() {
		launchurl("https://adactinhotelapp.com/");
	}

	@When("have to login by valid email and password")
	public void have_to_login_by_valid_email_and_password(io.cucumber.datatable.DataTable d) {
		List<String> li = d.asList();
		WebElement userName = driver.findElement(By.id("username"));
		fillTextBox(userName, li.get(0));
		WebElement password = driver.findElement(By.id("password"));
		fillTextBox(password, li.get(1));
		WebElement login = driver.findElement(By.id("login"));
		toClickButton(login);
	}

	@When("ensure user has to be in search hotel page")
	public void ensure_user_has_to_be_in_search_hotel_page() {
		String cururl = driver.getCurrentUrl();
		if (cururl.contains("SearchHotel.php")) {
			System.out.println(" User is in correct page");
		}
	}

	@When("have to enter the details of hotel room")
	public void have_to_enter_the_details_of_hotel_room(io.cucumber.datatable.DataTable d1) {
		WebElement loc = driver.findElement(By.id("location"));
		dropDown(loc, "Adelaide");
		WebElement hotel = driver.findElement(By.id("hotels"));
		dropDown(hotel, "Hotel Creek");
		WebElement roomType = driver.findElement(By.id("room_type"));
		dropDown(roomType, "Double");
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		dropDown(noOfRooms, "3 - Three");
		List<String> li = d1.asList();
		WebElement chckindate = driver.findElement(By.id("datepick_in"));
		String v1 = li.get(0);
		passValueByJavaExecutor(v1, chckindate);
		WebElement chckoutdate = driver.findElement(By.id("datepick_out"));
		String v2 = li.get(1);
		passValueByJavaExecutor(v2, chckoutdate);
		WebElement adltRoom = driver.findElement(By.id("adult_room"));
		dropDown(adltRoom, "2 - Two");
		WebElement chldRoom = driver.findElement(By.id("child_room"));
		dropDown(chldRoom, "1 - One");

	}

	@When("have to click search button")
	public void have_to_click_search_button() {
		WebElement search = driver.findElement(By.id("Submt"));
		toClickButton(search);
	}

	@When("ensure have to in correct page and click radio button")
	public void ensure_have_to_in_correct_page_and_click_radio_button() {
		String cururl = driver.getCurrentUrl();
		if (cururl.contains("SearchHotel.php")) {
			System.out.println("User is in correct pag");
		}
		WebElement clkRadiobtn = driver.findElement(By.id("radiobutton_0"));
		toClickButton(clkRadiobtn);
	}

	@When("have to click continue button")
	public void have_to_click_continue_button() {
		WebElement cont = driver.findElement(By.id("continue"));
		toClickButton(cont);
	}

	@When("have to enter valid personal details of user")
	public void have_to_enter_valid_personal_details_of_user(io.cucumber.datatable.DataTable d) {
		List<String> list = d.asList();
		WebElement fname = driver.findElement(By.id("first_name"));
		fillTextBox(fname, list.get(0));
		WebElement lname = driver.findElement(By.id("last_name"));
		fillTextBox(lname, list.get(1));
		WebElement address = driver.findElement(By.id("address"));
		fillTextBox(address, list.get(2));
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		fillTextBox(ccnum, list.get(3));
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		fillTextBox(ccv, list.get(4));
		WebElement ccType = driver.findElement(By.id("cc_type"));
		dropDown(ccType, "American Express");
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		dropDown(expMonth, "January");
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		dropDown(expYear, "2022");

	}

	@When("have to enter book now button")
	public void have_to_enter_book_now_button() {
		WebElement booknow = driver.findElement(By.id("book_now"));
		toClickButton(booknow);

	}

	@When("have to scrol down confirm correct page and take screenshot")
	public void have_to_scrol_down_confirm_correct_page_and_take_screenshot() throws IOException, InterruptedException {
		threadSleep(5000);
		pageDown();
		String cururl = driver.getCurrentUrl();
		if (cururl.contains("BookingConfirm.php")) {
			System.out.println("User is in bookingconfirm page");
		}
		takeScrrenShot("orderID");
	}

	@When("have to generate order ID")
	public void have_to_generate_order_ID() throws InterruptedException {
		// threadSleep(10000);
		WebElement orderNo = driver.findElement(By.id("order_no"));
		String text = orderNo.getAttribute("value");
		System.out.println("BOOKING ORDER NO" + text);
	}
}
