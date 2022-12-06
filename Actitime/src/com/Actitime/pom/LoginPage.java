package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLibrary.BaseClass;

public class LoginPage extends BaseClass {
	
	// 1st Declaration
	// why used findby bcoz if page fails by wrong id pass, page will refresh and address is being change so use this.
	// @findby work same as findelements works
	// after wrong pass username driver.findelements will not able to locate thats why using @findby
	@FindBy (id="username")
	private WebElement untbx;  // To hide
	
	@FindBy (name="pwd")
	private WebElement pwtbx;
	
	@FindBy (xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	// 2nd Initialization
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this); // page factory is class we use in POM, init elements is static method hence calling by class name.
		// driver,this the constructor dont know what is driver that's why we passed webdriver driver in constructor
		// this--> will take driver and will provide it to take it to the above program for execution
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	
	// do it to take all info to the base class
	
	// creating generic method to use following data into base class---> in before method
	// means creating non static method
	public void logintoActitime(String un, String pw) {  // formal arguments here we pass in methods
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	
	// after this go to base class --> @before method
	

}
