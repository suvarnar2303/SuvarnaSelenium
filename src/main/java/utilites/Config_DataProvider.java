package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_DataProvider {
	
	 public Properties p;
	public void confiDataprovider() throws FileNotFoundException, IOException
	{
		p=new Properties();
		p.load(new FileInputStream("./Testdata/Config.properties"));
		
	}
	public String getBrowserFromconfig()
	{
		String b = p.getProperty("Browser");
		return b;
	}
	public String getUrlFromconfig()
	{
		 return p.getProperty("Url");
	}
	
	

}
