package com.Actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLibrary.ReadDataFromExcel;

public class TaskPage  {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddnewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customername;
	
	@FindBy (xpath="(//textarea[@class='textarea'])[9]")
	private WebElement description;

	@FindBy (xpath="//div[@class='emptySelection']")
	private WebElement dropdown;

	@FindBy (xpath="(//div[@class='itemRow cpItemRow '])[3]")
	private WebElement bbcompany;

	@FindBy (xpath="(//div[@class='components_button_label'])[17]")
	private WebElement createcustbutton;

	public WebElement getDescription() {
		return description;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getBbcompany() {
		return bbcompany;
	}

	public WebElement getCreatecustbutton() {
		return createcustbutton;
	}

	public WebElement getAddnewBtn() {
		return AddnewBtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}
	
	public WebElement getCustomername() {
		return customername;
	}
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addnew() {
		AddnewBtn.click();
		newcustomer.click();
	}
	
	public void createnew() throws EncryptedDocumentException, IOException {
		
		AddnewBtn.click();
		newcustomer.click();
		ReadDataFromExcel r=new ReadDataFromExcel();
		String name = r.readDataFromExcelFile("Sheet1", 1, 1);
		customername.sendKeys(name);
		description.sendKeys("Banking");
		dropdown.click();
		bbcompany.click();
		createcustbutton.click();
	
	}

}
