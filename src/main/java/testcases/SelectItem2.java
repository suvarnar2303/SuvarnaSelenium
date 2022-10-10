package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FilterAndSelectProduct;
import pages.SearchItems;
import pages.SelectProduct;

public class SelectItem2 extends Base_Test{
	
	@Test
	public void Select() throws InterruptedException
	{
		Reporter.log("SelectItem2 test case stared to run", true);
		//logger = report.createTest("search the product");
        SearchItems Sea = new SearchItems(driver);
       // logger.info("Start enter the item");
        Sea.Search("Shoes for men");
        Sea.submit();
      // logger.info("submit is Successfull");
        FilterAndSelectProduct flt = new FilterAndSelectProduct(driver);
      // flt.ApplyReviews("4 stars & Up");
       flt.SelectBrand("PUMA");
   //     logger.info("brand is selected");
        flt.minprice("80");
        Thread.sleep(2000);
        flt.maxprice("150");
        flt.Ok();
        Thread.sleep(2000);
        SelectProduct Slt = new SelectProduct(driver);
       Slt.SelectItem("PUMA Unisex-Adult Smash v2 NBK Sneaker");  
        Slt.SelectTheSize("10.5");
       if(Slt.Error().size()>0)
        {
        	System.out.println("out of stock");
        }
        else if(Slt.Error().size()>0)
        {
        	System.out.println("unavailable for this adrress");
        }
        else {
        	
       Slt.SelectQuntity("2");
      Thread.sleep(3000);
       Reporter.log("Quntity is selected", true);
    Slt.addcart();
      Reporter.log("item Added to cart", true);}
	Reporter.log("SelectItem2 test case stared to run", true);
	}
	@DataProvider
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		Object[][] d = excel.Exceldata("./Testdta.excel.xlsx", "Sheet1");
		return d;
	}

}
