package Academy;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class validateTitle extends base {
	
	public static Logger Log=LogManager.getLogger(base.class.getName());
	LandingPage l;
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		Log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage");
	}
	
	
	@Test()
	
	public void validateAppTitle() throws IOException
	{
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		l=new LandingPage(driver);
		
		//compare the text from the browser with actual text. - Error
		Assert.assertEquals(l.getTitle().getText(), "123ИНТЕРНЕТ-МАГАЗИН СПОРТИВНОГО ПИТАНИЯ");
		Log.info("Successfully validated TextMessage");
	}
	
	public void validateHeader() throws IOException
	{
		
		//one is inheritance
		//creating object to that class and invoke methods of it
	
		
		//compare the text from the browser with actual text. - Error
		Assert.assertEquals(l.getHeader().getText(), "Brutalshop.ru - интернет-магазин спортивного питания");
		Log.info("Successfully validated TextMessage");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}
