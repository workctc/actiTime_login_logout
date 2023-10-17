package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.Autoconstants;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class loginpage extends BasePage implements Autoconstants {
	public WebDriver driver;
	//declaration
	@FindBy(id="username")
	private WebElement usernamebox;
	
	@FindBy(name="pwd")
	private WebElement passwordbox;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keeploginbox;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotpassword;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeInclink;
	
	//initialization
	
	public loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void loginmethod() throws InterruptedException,IOException
	{
		visibilityOfElement(driver, usernamebox);
		javascriptHighlight(driver, usernamebox);
		
		usernamebox.sendKeys(ExcelLibrary.getcellValue(login_data_sheetname,1,0));
		visibilityOfElement(driver, passwordbox);
		javascriptClick(driver, passwordbox);
		passwordbox.sendKeys(ExcelLibrary.getcellValue(login_data_sheetname, 1, 1));
		visibilityOfElement(driver, loginbutton);
		javascriptClick(driver, loginbutton);
		loginbutton.click();
	}
	public void forgotpassword() throws InterruptedException {
		forgotpassword.click();
		Thread.sleep(3000);
	}
	public void actitimeInclink() throws InterruptedException {
		actitimeInclink.click();
		Thread.sleep(3000);
	}
}




















