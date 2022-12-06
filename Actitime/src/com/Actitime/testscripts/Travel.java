package com.Actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Travel {
	@Test(groups="smoke")
	public void visitedMarine() {
		Reporter.log("visited to marine",true);
	}
	
	@Test(groups="regression")
	public void visitedKorumMall() {
		Reporter.log("Not visited to korum mall",true);
	}
	
	@Test(groups={"smoke","regression"})
	public void visitedTitwala() {
		Reporter.log("visited to titwala",true);
	}
	
	@Test(groups="smoke")
	public void visitedTemple() {
		Reporter.log("visited to temple",true);
	}
	
	

}
