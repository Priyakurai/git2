package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_priority {
 
	 @Test
	  public void C() {
		 Reporter.log("C is running",true);
	  }
	 @Test
	  public void A() {
		 Reporter.log("A is running",true);
	  }
	 @Test
	  public void B() {
		 Reporter.log("B is running",true);
	  }
}
