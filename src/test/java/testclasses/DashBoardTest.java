package testclasses;

import org.testng.annotations.Test;

import extenlistener.ListenerClass;

public class DashBoardTest extends ListenerClass{
@Test(priority=3)
public void searchValidation()
{
	db.clickOnGetStarted();
	test.info("Clicked on get Started button");
	db.searchShares();
	test.info("Searched the Shares");
}
@Test(priority=4)
public void buySharesValidation() {
	db.buyShares();
	test.info("Share has been buyed");
}

}
