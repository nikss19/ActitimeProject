package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
	public String readDataFromPropertyFile(String key) throws IOException {
		
		// created TestData folder to store Note pad file then we can use here
		FileInputStream fis = new FileInputStream("./TestData/commondata1.property"); // to initialize with another class
		Properties p = new Properties();
		p.load(fis);
		 String value = p.getProperty(key);  // not hard coding here
		 return value;
		
	}

}
