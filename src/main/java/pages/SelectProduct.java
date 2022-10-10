package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectProduct {
	 public WebDriver driver;
	 public SelectProduct(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//div[@class=\"sg-col-inner\"]/descendant::span[@class=\"a-size-base-plus a-color-base a-text-normal\"]")
	 private  List<WebElement> DisplayItem;
	 @FindBy(xpath="(//span[@class='a-dropdown-container'])[1]")
	 private WebElement Selec;
	  @FindBy(xpath="//ul[@role=\"listbox\"]/li")	  
	  private List<WebElement> SelectSize; 
	  @FindBy(xpath="(//span[@class='a-dropdown-container'])[2]")
	  private WebElement Q;
	  @FindBy(id="native_dropdown_selected_size_name")
	  private WebElement S;
	  @FindBy(id="quantity")
	  private WebElement SelectQyt;
	  @FindBy(xpath="//input[@id=\"add-to-cart-button\"]")
	  private WebElement addToCart;
	  @FindBy(xpath="//div[@id=\"deliveryBlockMessage\"]/descendant::span[@class=\"a-color-error\"]")
	  private List<WebElement> errormsg;
	  @FindBy(xpath="//div[@id=\"outOfStock\"]/descendant::span[@class=\"a-color-price a-text-bold\"]")
	  private List<WebElement> unavailable;
	  
	  public void SelectItem(String productName)
	  {
		  int S = DisplayItem.size();
		  for(int i=0;i<S;i++)
		  {
			  String text = DisplayItem.get(i).getText();  
			  if(text.equalsIgnoreCase(productName))
			  {
				  DisplayItem.get(i).click();
				  
			  }
			  
		  }
	  }
	  public void SelectTheSize(String D)
	  {
		  Selec.click();
		  for(int i=0;i< SelectSize.size();i++)
		  {
			       String s = SelectSize.get(i).getText();
			       if(s.equalsIgnoreCase(D))
			       {
			    	   SelectSize.get(i).click();
			       }
		  }
	
	  }
	  public void SelectQuntity(String Qt)
	  {       Q.click();
		    
	  for(int i=0;i< SelectSize.size();i++)
	  {
		       String s = SelectSize.get(i).getText();
		       if(s.equalsIgnoreCase(Qt))
		       {
		    	   SelectSize.get(i).click();
		       }
	  }
	  }
	  		public void addcart()
	  		{
	  			addToCart.click();
	  		}
	        public List<WebElement> Error()
	        {
	        	return    errormsg;
	        }
				
	        
	        public List<WebElement> unavailable()
	        {
	        	 return unavailable;
	        
	
	        }
	
	}


