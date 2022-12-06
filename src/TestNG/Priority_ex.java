package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_ex {


	  @Test(priority = -3)
	  public void C() {
		 Reporter.log("C is running",true);
	  }
	 @Test()
	  public void A() {
		 Reporter.log("A is running",true);
	  }
	 @Test(priority = 2)
	  public void B() {
		 Reporter.log("B is running",true);
	  }
  }

