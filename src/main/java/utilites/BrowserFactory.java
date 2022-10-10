package utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public static WebDriver startApp(WebDriver driver,String Browsername,String url)
	{
		if(Browsername.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browsername.contains("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browser is not present");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		return driver;
	}

	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	}

