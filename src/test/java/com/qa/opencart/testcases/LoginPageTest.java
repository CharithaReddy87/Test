package com.qa.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseClass;
import com.qa.opencart.utilities.Constants;

public class LoginPageTest extends BaseClass {
	@Test(priority=1)
	public void testUrl() {
		String url = loginpage.getLogingPageUrl();
		Assert.assertEquals(url, Constants.ACTUAL_URL);
	}
	@Test(priority=2)
	public void testPageTitle()
	{
		String title=loginpage.getLoginPageTitle();
				Assert.assertTrue(title.contains(Constants.ACTUAL_TITLE));

}
	@Test(priority=3)
	public void doLogin()
	{
		loginpage.login(prop.getProperty("username").trim(),prop.getProperty("password").trim());
		
	}
}
