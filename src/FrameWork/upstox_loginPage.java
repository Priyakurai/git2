package FrameWork;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_loginPage {
	
	//Variable declaration
@FindBy(name="userId") private WebElement userID;
@FindBy(name="password") private WebElement password;
@FindBy(xpath="//div[text()='sign into Upstox']")private WebElement signIn;



public upstox_loginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
}
//Variable initialization
public void upstok_login(WebElement driver)
{
	PageFactory.initElements(driver, this);
	}
//variable uses
public void enterUserID(CharSequence[] row)
{
	userID.sendKeys(row);
	}
public void enterPassword(String pwd)
{
	password.sendKeys(pwd);
	}

public void clicksignInButton()
{
	signIn.click();
	}
public void enterUserID1(Row row) {
	// TODO Auto-generated method stub
	
}




	}


