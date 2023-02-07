package www.MyProject;

import org.BaseClasscucu.BaseFrame;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoMyproject extends BaseFrame {
public PojoMyproject() {
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//a[text()='Visit ']")
private WebElement popUp;


@FindBy(xpath = "//span[text()='×']")
private WebElement ndpopUp ;


@FindBy(xpath="//div[contains(@Class,'custom')]//div//form[contains(@id,'search-')]")
	private WebElement searchBox;

@FindBy(xpath = "//div[contains(@Class,'custom')]//div//form//following-sibling::button[@Class='submit']")
private WebElement clickButton;



public WebElement getPopUp() {
	return popUp;
}



public WebElement getNdpopUp() {
	return ndpopUp;
}


public WebElement getSearchBox() {
	return searchBox;
}


public WebElement getClickButton() {
	return clickButton;
}



}
