package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_enabled {
  
	  @Test
	  public void TC1() {
		 Reporter.log("TC1 is running",true);
	  }
	 @Test(enabled=false)
	  public void TC2() {
		 Reporter.log("TC2 is running",true);
	  }
	 @Test()
	  public void TC3() {
		 Reporter.log("TC3 is running",true);
	  }
  }

