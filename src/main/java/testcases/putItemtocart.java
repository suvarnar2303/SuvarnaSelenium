package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pages.SearchItems;

public class putItemtocart extends Base_Test {
	
	@Test(groups= {"smoke"})
	public void login() throws InterruptedException {
		Reporter.log("putItemtocart test case will stated to run ", true);
		               SearchItems Sea = new SearchItems(driver);
//	    SearchItems Sea =PageFactory.initElements(driver, SearchItems.class);
//	    logger.info("Start enter the item");
	     Sea.Search("Shoes for men");
	     Sea.submit();
	    // logger.info("submit is Successfull");
	     Reporter.log("login test case is ended", true);
//	     System.out.println("hello");
	}

}
