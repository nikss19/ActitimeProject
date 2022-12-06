package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	// 1. Declaration
	@FindBy(id="logoutLink")
	private WebElement lgoutlnk;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportlnk;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userlnk;
	
	// 2. Initialization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLgoutlnk() {
		return lgoutlnk;
	}

	public WebElement getTasklnk() {
		return tasklnk;
	}

	public WebElement getReportlnk() {
		return reportlnk;
	}

	public WebElement getUserlnk() {
		return userlnk;
	}
	
	// Generalized methods
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		lgoutlnk.click();
		
	}
	
	public void report() {
		reportlnk.click();
	}
	
	public void tasks() throws InterruptedException {
		tasklnk.click();
		Thread.sleep(1000);
	}
	
	public void users() {
		userlnk.click();
	}

	public void tasklnk() throws InterruptedException {
		tasklnk.click();
		Thread.sleep(1000);
	}


}
