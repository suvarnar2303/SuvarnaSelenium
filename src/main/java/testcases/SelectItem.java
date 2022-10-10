package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.FilterAndSelectProduct;
import pages.SearchItems;
import pages.SelectProduct;

public class SelectItem extends Base_Test{
	
	@Test
	public void Select() throws InterruptedException
	{
	
		Reporter.log("SelectItem test case will stated to run ", true);
	      report.createTest("search the product");
		 SearchItems Sea =PageFactory.initElements(driver, SearchItems.class);
       logger.info("Start enter the item");
        Sea.Search("Shoes for men");
        Sea.submit();
       logger.info("submit is Successfull");
        FilterAndSelectProduct flt = new FilterAndSelectProduct(driver);
      // flt.ApplyReviews("4 stars & Up");
       flt.SelectBrand("Nike");
        logger.info("brand is selected");
        flt.minprice("40");
        Thread.sleep(2000);
        flt.maxprice("100");
        flt.Ok();
        Thread.sleep(2000);
        SelectProduct Slt = new SelectProduct(driver);
         Slt.SelectItem("Nike Men's Running Shoe");  
        Slt.SelectTheSize("7");
                   
        if(Slt.unavailable().size()>0)
        {
        	System.out.println("this is Currently un");
        }
        else if(Slt.Error().size()>0)
        {
        	System.out.println("unavailable for this adrress");
        }
        else
        	{
       Slt.SelectQuntity("2");
      
       Slt.addcart();
      Reporter.log("item Added to cart", true);
      Reporter.log("login test cases id ended", true);
        	}
	}
	

}
