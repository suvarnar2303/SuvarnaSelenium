package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSelectProduct {
	public WebDriver driver;
	
	public  FilterAndSelectProduct(WebDriver driver) 
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='reviewsRefinements']/descendant::span[@class='a-icon-alt']")
	private List<WebElement> reviews;
	@FindBy(xpath="//div[@id='brandsRefinements']/descendant::span[@class='a-size-base a-color-base']")
	private List<WebElement> brands;
	@FindBy(xpath="//input[@id='low-price']")
	private WebElement minprice;
	@FindBy(xpath="//input[@id='high-price']")
	private WebElement maxprice;
	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement go;  
	public void ApplyReviews(String r)
	{
		  int S = reviews.size();
		  for(int i=0;i<S;i++)
		  { String rating = reviews.get(i).getText();
			  if(r.contains(rating))
			  {  reviews.get(i).click();  }
			  else
			  { 
				  System.out.println("option is not available");} }}
	public void SelectBrand(String brand) 
	{
		int S = brands.size();
		for(int i=0;i<S;i++)
		{String b = brands.get(i).getText();
			if(b.contains(brand))
			{
				brands.get(i).click();
				break;
			}
			}
		}
	public void minprice(String m)
	{
		minprice.sendKeys(m);
	}
	public void maxprice(String m)
	{ 
		maxprice.sendKeys(m);
		}
	public void Ok()
	{
		go.click();
	}
	public void Ok2()
	{
		go.click();
	}

}
