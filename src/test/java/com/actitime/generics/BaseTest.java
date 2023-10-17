package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements Autoconstants {
	
	public WebDriver driver;
	public Properties properties;
	
	@BeforeSuite
	public void executionStart()
	{
		Reporter.log("----------Execution Started----------",true);
	}
	
	@BeforeClass
	public void setup() throws IOException
	{
		
		FileInputStream fis=new FileInputStream(properties_path);
		properties=new Properties();
		properties.load(fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(properties.getProperty("url"));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executionComplete()
	{
		Reporter.log("----------Execution Completed----------",true);
	}
}

