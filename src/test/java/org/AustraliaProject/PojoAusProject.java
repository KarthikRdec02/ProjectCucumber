package org.AustraliaProject;

import java.util.List;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAusProject extends BaseFrame{
public PojoAusProject() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[contains(@class,'yAsil')]")
private WebElement searchox;

@FindBy(xpath = "//div[contains(@class,'uCRVW')]//following-sibling::a//div//div[text()='Christmas']")
private WebElement selectChristmas;

@FindAll(value = { @FindBy(xpath = "//div[text()='Add product to Wishlist']"),
					@FindBy(xpath = "//div[text()='Remove product from Wishlist']")})
private List<WebElement> AddFirstProductWishList;



@FindAll(value= {@FindBy(xpath = "//div[@class='MyvrX']"),
				 @FindBy(xpath = "//div[@class='lzBUP']")})
private List<WebElement> SelectFirstProduct;




@FindBy(xpath = "//span[text()='Add To Cart']")
private WebElement AddFirstProductInCart;



public List<WebElement> getSelectFirstProduct() {
	return SelectFirstProduct;
}
public List<WebElement> getAddFirstProductWishList() {
	return AddFirstProductWishList;
}

public WebElement getAddFirstProductInCart() {
	return AddFirstProductInCart;
}

public WebElement getSearchox() {
	return searchox;
}

public WebElement getSelectChristmas() {
	return selectChristmas;
}






}
