package Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Neostox.NeostoxBase;
import Upstoxutility.UtilityNew;


	public class Listener extends NeostoxBase implements ITestListener
	{
	@Override
	public void onTestFailure(ITestResult result)
	{
		String name= result.getName();
		
	Reporter.log("Test is failed please have a look again", true);
	Reporter.log("Test is failed, taken screenshot",true);
	try {
		UtilityNew.screenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
	Reporter.log("Test is completed successfully", true);
	}
	
	 @Override
		public void onTestSkipped(ITestResult result)
	{
	Reporter.log("Test is skipped please retry", true);
	}
	}

