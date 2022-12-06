package com.Actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hotel {
	@Test(groups="regression")
	public void wentTajHotel() {
		Reporter.log("lunch at Taj Hotel",true);
	}
	
	@Test(groups="smoke")
	public void wentSagarHotel() {
		Reporter.log("lunch at Sagar Hotel",true);
	}
	
	@Test(groups={"regression","smoke"})
	public void wentAradhanaHotel() {
		Reporter.log("lunch at Aradhana Hotel",true);
	}
	
	

}
