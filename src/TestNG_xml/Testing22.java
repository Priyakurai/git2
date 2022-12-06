package TestNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing22 {

	 @Test(groups = "funds")
	  public void F() {
		  Reporter.log("F TC running",true);
	  }
	  @Test(groups = "homepage")
	  public void G() {
		  Reporter.log("G TC running",true);
	  }
	  @Test(groups = "funds")
	  public void H() {
		  Reporter.log("H TC running",true);
	  }
	  @Test(groups = "homepage")
	  public void I() {
		  Reporter.log("I TC running",true);
	  }
	  @Test(groups = "homepage")
	  public void J() {
		  Reporter.log("J TC running",true);

	}

}
