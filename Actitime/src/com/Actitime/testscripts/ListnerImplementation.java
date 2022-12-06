package com.Actitime.testscripts;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Actitime.GenericLibrary.BaseClass;
import com.google.common.io.Files;

public class ListnerImplementation extends BaseClass implements ITestListener {
	
	

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testscript passed",true);
	}

	// we have to take ss when test gets fails
	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName(); //why result. bcoz all this block o/p stores into the result
//		WebDriver driver=new ChromeDriver(); sir removed this 2 steps later and extends baseclass above
//		driver.get("https://demo.actitime.com");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+name+".png");
//		Files.copy(src, dest); is giving error so we using try catch block
		try {
			Files.copy(src, dest);
		} catch (Exception e) {
			
			
		}
		driver.close();
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
