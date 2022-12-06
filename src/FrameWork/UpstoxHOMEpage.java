package FrameWork;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import screenshoot.ScreenshootgeneralMethod;
import unknown.Scrolling;

public class UpstoxHOMEpage {
	
	@FindBy(xpath="//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	@FindBy(id="funds")  private static WebElement funds;
	@FindBy(xpath="//div[text()='Logout']")private WebElement logoutButton;
	//variable initialization(constructor)	
		public UpstoxHOMEpage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}	
	
public void validateUserID(WebDriver driver ,String expID) throws IOException
{

	ScroolingFunction.scrollIntoView(driver,userID);
	
	String actualUserID = userID.getText();
	String expectedUserID=expID;
	ScreenshootgeneralMethod.screenshotmethod(driver,actualUserID);
	if(actualUserID.equalsIgnoreCase(expectedUserID))
	{
		
		System.out.println("actual and expected are matching TC passed");
	}
	
	else
	{
		
		System.out.println("actual and expected are not matching TC failed");
	}
}
	
	public static void clickOnFunds(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		ScroolingFunction.scrollIntoView( driver,funds);
		try {
			funds.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);
		
	}
	
	
	
	
	
		
}
