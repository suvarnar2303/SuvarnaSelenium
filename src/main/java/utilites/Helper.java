package utilites;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public WebDriver driver;
	public static String captureScreenShot(WebDriver driver) throws IOException
	{
		String Screenpath=System.getProperty("user.dir")+"Report"+getCurrentdateTime()+".png";
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		 File dst=new File(Screenpath);
		FileHandler.copy(src, dst);
		       String ScreenShotpath = dst.getAbsolutePath();
		       return ScreenShotpath;
	}
	
	public static void handleFrames()
	{
		
	}
   public static void handlealert()
   {
	   
   }
   public static void Action() throws AWTException
   {
	   
   }
   public static void DisableElement()
   {
	   
   }
   public static String getCurrentdateTime()
   {
	   SimpleDateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	        Date currentDate = new Date();
			 return customFormat.format(currentDate);
   }
}
