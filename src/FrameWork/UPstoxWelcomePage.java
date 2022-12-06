package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UPstoxWelcomePage {
//variable initialization
	@FindBy(xpath="//div[text()='I'am good']")private WebElement noIamGoodButton;
	
	
	//variable
	public UPstoxWelcomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnnoIamGoodButton()
	{
		noIamGoodButton.click();
	}
}
