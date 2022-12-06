package Neostox;

import org.testng.annotations.Test;


	import org.testng.annotations.BeforeMethod; 
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import java.io.IOException;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	public class NeostoxTestNG extends NeostoxBase
	{
	NeostoxloginPage login;
	WelcomePage welcome;
	NeostoxHomePage home;
	@BeforeClass
	public void openbrowser() throws IOException
	{
	LaunchBrowser(); 
	
	login=new NeostoxloginPage();
	welcome=new WelcomePage(driver);
	home =new NeostoxHomePage(driver);
	}
	@BeforeMethod
	public void loginfunction() throws IOException, InterruptedException
	{
	login.EnterUserID(NeostoxUtility.readDatafromPropertyFile("id"));
	login.clickonsignup(); 
	login.enterpassword(NeostoxUtility.readDatafromPropertyFile("pass"));
	welcome.clikeonbuttons();
	}
	@Test
	public void validateuserid() throws IOException, InterruptedException
	{
	Assert.assertEquals(home.validatepeofile(driver),NeostoxUtility.readDatafromPropertyFile("actualUs erId"),"actualUserId is not match then TC fails");
	Reporter.log("both profilename match TC pass", true);
	NeostoxUtility.wait(driver, 2000);
	home.validateFundAmount();
	Thread.sleep(4000);
	}
	@AfterMethod
	public void clickonlogout() throws
	InterruptedException
	{
	home.clickonLogout();
	}
	@AfterClass
	public void closebrowser()
	{
	Reporter.log("Close Browser Sucussfully",true);
	driver.close();
	}
	}

