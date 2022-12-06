package com.Actitime.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void getScreenshot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shaadi.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/ss.png");
		Files.copy(src, dest);
		
	}

}
