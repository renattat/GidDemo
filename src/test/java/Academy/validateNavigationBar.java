package Academy;

import java.io.IOException;
//Adding logs
//Generating html reports
//screen shots on failure
//Jenkins integration

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

public class validateNavigationBar extends base {
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}
	
	

	
	
	@Test()
	
	public void validateAppNavigationBar() throws IOException
	{
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
		
		//compare the text from the browser with actual text. - Error
		
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		Log.info("Navigation VAr is displaed");
		
		
		
	}
	
	
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}
