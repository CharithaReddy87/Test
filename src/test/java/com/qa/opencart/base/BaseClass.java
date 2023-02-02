package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.driverfactory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseClass {
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected LoginPage loginpage;
	@BeforeTest
	public void setup()
	{
		df=new DriverFactory();
		prop=df.init_prop();
		driver=df.init_browser(prop);
		loginpage= new LoginPage(driver);
		
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit(); 
	}
}
 