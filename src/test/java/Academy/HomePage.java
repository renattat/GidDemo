package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger Log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initializeDriver();
		
		
	}
	
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password, String text) throws IOException
	{
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();//driver.findElement(by.css())
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
		Log.info(text);
		lp.getLogin().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different data types should run
		//columns stands for how many values per each test
		
		//Array is 5
		//0,1,2,3,4
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Non Restricted User";
		//1th row
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456789";
		data[1][2]="Restricted User";
		
		return data;
		
				
		
	}
	
	

}
