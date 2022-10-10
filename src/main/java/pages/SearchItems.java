package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchItems {
	WebDriver driver;
	public SearchItems(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   @FindBy(id="twotabsearchtextbox")
   private WebElement searchbox;
   @FindBy(id="nav-search-submit-button")
   private WebElement search;
   
   
   public void Search(String itemname) throws InterruptedException   
   {
	   searchbox.sendKeys(itemname);
	   Thread.sleep(2000);
	 }
   public void submit()
   {
	   search.click();
   }
}
