package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.Actitime.pom.Homepage;
import com.Actitime.pom.LoginPage;

public class BaseClass {
	
	// Generic methods--> non-static methods
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	// we are calling the data from generic library
	

	// why static.. bcoz it should work in this class only. not to use in another class.
	public static WebDriver driver;  
//	why static..bcoz it should work in this class only. not to use in another class.

	// giving database connection
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected", true);
	}

	@AfterSuite
	public void databasedConnection() {
		Reporter.log("database disconnected", true);
	}
	
//	@Test  // without test annotation we can't run this base class
//	public void createCustomer() {
//		Reporter.log("Customer created",true);
//	}

	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();  //here we create object of chrome driver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("browser closed", true);
		driver.close();
	}

	@BeforeMethod   // for that we create seperate class of readDatafromProperty
	public void login() throws IOException, InterruptedException {
		// to get data from ReadDataFromPropertyFile class do next step
		ReadDataFromProperty data=new ReadDataFromProperty();
		
		String URL = data.readDataFromPropertyFile("url"); // here we pass key to get value
		String un = data.readDataFromPropertyFile("username");
		String pw = data.readDataFromPropertyFile("password");
		
		driver.get(URL); //no hard coding here
		//Thread.sleep(3000);
		
		LoginPage lp =new LoginPage(driver);
		lp.logintoActitime(un, pw);   // logintoactitime is a method where we passed actual arguments
		
		// Now using POM class so no need below steps
		//driver.findElement(By.id("username")).sendKeys(un);
		//Thread.sleep(3000);
		//driver.findElement(By.name("pwd")).sendKeys(pw);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		//Thread.sleep(3000);

	}
	
	
	// since login done by using @beforemethod, so logout should be done by using @aftermethod only.
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		//driver.findElement(By.id("logoutLink")).click();
		Homepage hp = new Homepage(driver);
		
				hp.logout();
	}

}
