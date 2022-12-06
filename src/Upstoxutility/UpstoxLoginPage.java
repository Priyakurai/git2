package Upstoxutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage {
	//Variable declaration
@FindBy(name="userId") private WebElement userID;
@FindBy(name="password") private WebElement password;
@FindBy(xpath="//div[text()='sign into Upstox']")private WebElement signIn;




	
//Variable initialization
public void UpstokLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
//variable uses
public void SendUserNames(String un)
{
      userID.sendKeys(un);
	}
public void sendPassword(String pwd)
{
	password.sendKeys(pwd);
	}

public void clicksignInButton()
{
	signIn.click();
	}



}
