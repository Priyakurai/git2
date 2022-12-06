package FrameWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstok_login {
	//Variable declaration
@FindBy(name="userId") private WebElement userID;
@FindBy(name="password") private WebElement password;
@FindBy(xpath="//div[text()='sign into Upstox']")private WebElement signIn;



//Variable initialization
public upstok_login(WebElement driver)
{
	PageFactory.initElements(driver, this);
	}
//variable uses
public void enterUserID()
{
	userID.sendKeys("6WB2AP");
	}
public void enterPassword()
{
	password.sendKeys("Sangu@1996");
	}

public void clicksignInButton()
{
	signIn.click();
	}




}
