package testcases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sell extends Base_Test{
	
	@Test(enabled=false)
	public void clickSell() throws InterruptedException
	{
		
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon.com: Sell Products Online with Selling on Amazon.");
		System.out.println("testcase is pass");
		
	}

}
