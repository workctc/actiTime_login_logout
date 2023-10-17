package com.actitime.generics;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class BasePage 
	{
		//WebDriver Interface
		public void getPageTitle(WebDriver driver , String expectedTitle)
		{
			String actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle , "title is not matching as per expectation");
		}
		
		//WebElement Interface
		public void getElementText(WebElement element , String expectedText)
		{
			String actualText=element.getText();
			Assert.assertEquals(actualText, expectedText, "text is not matching as per client");
		}
		
		//Select Class
		public void selectVisibleText(WebElement element, String text)
		{
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		
		//Actions Class
		public void goToElement(WebDriver driver, WebElement element)
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		
		//Robot Class
		public void robotTab() throws AWTException
		{
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		
		//WebDriverWait Class
		public void visibilityOfElement(WebDriver driver, WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void visibilityOfElement(WebDriver driver, String text)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text)));
		}
		
		//JavascriptExecutorInterface
		public void javascriptClick(WebDriver driver, WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
		}
		
		public void javascriptEnter(WebDriver driver,String javascriptcode, WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript(javascriptcode, element);
		}
		
		public void javascriptHighlight(WebDriver driver, WebElement element) throws InterruptedException
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style' , 'background:green')", element);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style' , 'background:white')", element);
		}
		
		//Alert Interface
		public void alertAccept(WebDriver driver, String expectedAlertText)
		{
			String actualText=driver.switchTo().alert().getText();
			Assert.assertEquals(actualText, expectedAlertText,"alert text is not matching");
			driver.switchTo().alert().accept();
		}
	}

