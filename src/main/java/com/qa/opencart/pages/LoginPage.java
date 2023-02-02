package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.driverfactory.DriverFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	private By email= By.id("input-email");
	private By password= By.id("input-password");
	private By logbtn=By.xpath("//button[@type='submit']");
	private By forgotlink=By.linkText("Forgotten Password");
	
	public LoginPage(WebDriver  driver)
	{
		this.driver=driver;
	}
			
	public String getLoginPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String getLogingPageUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	public Boolean isForgotPwdLinkEixsts()
	{
		return driver.findElement(forgotlink).isDisplayed();
		
		
	}
	
	public void login(String usernmae, String pwd) {
		driver.findElement(email).sendKeys(usernmae);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(logbtn).click();
}
}
