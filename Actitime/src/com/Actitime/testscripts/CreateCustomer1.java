package com.Actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer1 {
	@Test(groups="smoke")
	public void deleteCustomer() {
		Reporter.log("deleted customer",true);
	}
	
	@Test(groups="smoke")
	public void modifyCustomer() {
		Reporter.log("modified customer",true);
	}
	
	@Test(groups="regression")
	public void editCustomer() {
		Reporter.log("edited customer",true);
	}
	
	@Test(groups={"smoke","regression"})
	public void addCustomer() {
		Reporter.log("added customer",true);
	}

}
