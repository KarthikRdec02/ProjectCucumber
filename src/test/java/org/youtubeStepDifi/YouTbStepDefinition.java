package org.youtubeStepDifi;

import java.util.List;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class YouTbStepDefinition extends BaseFrame {

	@Given("to open chrome browser")
	public void to_open_chrome_browser() {
		openChromeBrowser();
		Implicitwait(10);
	}

	@Given("to launch youtube website")
	public void to_launch_youtube_website() {
		launchurl("https://www.youtube.com/");
	}

	@Given("to maximize the window")
	public void to_maximize_the_window() {
	maxWindow();
	}

	@When("to search TamilSongs in search box")
	public void to_search_TamilSongs_in_search_box() {
		
	}

	@When("to click the first Tamil song")
	public void to_click_the_first_Tamil_song() {
		List<WebElement> songs = driver.findElements(By.xpath("//a[@id=\"video-title\"]"));
		WebElement firstsong = songs.get(0);
		firstsong.click();
	}

	@When("to press play button on the song")
	public void to_press_play_button_on_the_song() {
		WebElement playButton = driver
				.findElement(By.xpath("//div//following-sibling::button[contains(@Class,'ytp-play-')]"));
		playButton.click();
	}

	@When("to ensure whether that song is palying or not")
	public void to_ensure_whether_that_song_is_palying_or_not() {
		WebElement playButton = driver
				.findElement(By.xpath("//div//following-sibling::button[contains(@Class,'ytp-play-')]"));
		playButton.click();
	}

}

//	@Given("to open chrome browser")
//	public void to_open_chrome_browser() {
//	    openChromeBrowser();
//	    Implicitwait(10);
//	    
//	}
//
//	@Given("to launch youtube website")
//	public void to_launch_youtube_website() {
//	  launchurl("https://www.youtube.com/");
//	   
//	}
//
//	@Given("to maximize the window")
//	public void to_maximize_the_window() {
//	   maxWindow();
//	}
//
//	@When("to search TamilSongs in search box")
//	public void to_search_TamilSongs_in_search_box() {
//	    WebElement searchbox = driver.findElement(By.xpath("//div[@id='search-input']"));
//	    searchbox.sendKeys("Tamil Songs");
//	    searchbox.click();
//	}
//
//	@When("to click the first Tamil song")
//	public void to_click_the_first_Tamil_song() {
//	   List<WebElement> songs = driver.findElements(By.xpath("//a[@id=\"video-title\"]"));
//	   WebElement firstsong = songs.get(0);
//	   firstsong.click();
//	   
//	}
//
//	@When("to press play button on the song")
//	public void to_press_play_button_on_the_song() {
//	   WebElement playButton = driver.findElement(By.xpath("//div//following-sibling::button[contains(@Class,'ytp-play-')]"));
//	   playButton.click();
//	}
//
//	@When("to ensure whether that song is palying or not")
//	public void to_ensure_whether_that_song_is_palying_or_not() {
//		 WebElement playButton = driver.findElement(By.xpath("//div//following-sibling::button[contains(@Class,'ytp-play-')]"));
//		   playButton.click();
//	}
//
//
//		}
