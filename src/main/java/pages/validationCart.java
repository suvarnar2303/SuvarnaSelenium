package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validationCart {
	
	public WebDriver driver;
	public validationCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id=\"sw-atc-details-single-container\"]/descendant::span[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]")
	private WebElement confMsg;
	

}
