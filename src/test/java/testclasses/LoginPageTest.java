package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extenlistener.ListenerClass;
import pages.LoginPage;

public class LoginPageTest extends ListenerClass{
@Test(priority=1)
public void verifyLogin()
{
	
	lp.entercredentials();
	test.info("Credential has been entered");
	lp.clickOnLogin();
	test.info("Clicked on login button");
	lp.enterPin();
	test.info("Pin has been entered");
}
@Test(priority=2)
public void titleValidation()
{
  String actualtitle = lp.getTitleOfPage();
  test.info("Title of the page has been fetched");
  System.out.println(actualtitle);
  Assert.assertEquals(actualtitle, "Dashboarddd / Kiteee");
}
}
