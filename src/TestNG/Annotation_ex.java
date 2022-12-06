package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotation_ex {
  @Test
  public void Validate_pin() {
	  Reporter.log("Pin validation Done-->@Test used", true);
  }
  @Test
  public void Validate_user_id() {
	  Reporter.log("User Id validation Done-->@Test used", true);
  }
  @BeforeMethod
  public void EnterUserIdandpassworord() {
	  Reporter.log("userid and password entered done-->@beforemethod used",true);
  }

  @AfterMethod
  public void Logout() {
	  Reporter.log("logout done",true);
  }

  @BeforeClass
  public void browser_launch() {
	  Reporter.log("browser launched",true);
  }

  @AfterClass
  public void close_browser() {
	  Reporter.log("browser closed ",true);
  }

}
