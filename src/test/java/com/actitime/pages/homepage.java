package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.Autoconstants;
import com.actitime.generics.BasePage;

public class homepage extends BasePage implements Autoconstants {
	public WebDriver driver;
	//declaration
	@FindBy(xpath ="//div[@class='logoSwitcherText']")
	private WebElement switchactiplans;
	
	@FindBy(xpath="//a[@class='content selected tt']")
	private WebElement timetrack;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement users;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_calendar']")
	private WebElement calender;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settings;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_addons']")
	private WebElement addons;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
	private WebElement support;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_tips']")
	private WebElement tips;
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	private WebElement johnDoe;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[@class='supportQuestionButton']")
	private WebElement questionbutton;
	
	//initialization
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void actiplans(){
		switchactiplans.click();
	}
	public void timetrack() {
		timetrack.click();
	}
	public void tasks() {
		tasks.click();
	}
	public void reports() {
		reports.click();
	}
	public void users() {
		users.click();
	}
	public void calender() {
		calender.click();
	}
	public void settings() {
		settings.click();
	}
	public void addons() {
		addons.click();
	}
	public void support() {
		support.click();
	}
	public void tips() {
		tips.click();
	}
	public void johnDoe() {
		johnDoe.click();
	}
	public void logout() {
		visibilityOfElement(driver, logout);
		javascriptClick(driver, logout);
	}
	public void questionbutton() {
		questionbutton.click();
	}
}
