package com.Actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.TaskPage;
@Listeners(com.Actitime.testscripts.ListnerImplementation.class) // to take that program by taking package reference to get over rided methods
public class CreateCustomer extends BaseClass {
	
//	@Test
//	public void createCustomer() throws InterruptedException {
//		Reporter.log("customer created",true);
//		Thread.sleep(10000); // intentionally fails the testcase to get SS when program fails
////	now public void onTestSuccess "TestScript Passed" will not in o/p bcoz pgrm not executed
//		Assert.fail();
//	}
	
//	run this program
//	linked with the ListnerImplementation class 
//	in o/p
//	1st run this public void onTestStart(ITestResult result) {
//	Reporter.log("Test started",true);
	
//	then will run this
//	public void createCustomer() {
//		Reporter.log("customer created",true);
	
//	Now deleted 2nd @Test method
	
//	now removed @Test which was having assert.fail. bcoz now we'r doing actual test script
	
//	@Test
//	public void modifyCustomer() throws InterruptedException {
//		Reporter.log("customer modified",true);
//		Thread.sleep(10000);
//		Assert.fail();
//	}
	
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Homepage hp= new Homepage(driver);
		hp.tasklnk();
		
		TaskPage tp = new TaskPage(driver);
		tp.createnew();
	}


}
