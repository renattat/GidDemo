package resources;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
		public WebDriver driver;
		public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	
	{
		
		/*		
		prop= new Properties();
		//System.getProperty("user.dir")
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		// mvn test -Dbrowser=chrome\\
		
		String browserName = System.getProperty("browser");
		//String browserName=prop.getProperty("browser");
		
		if(browserName.contains("chrome"))
		{
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\FLORA\\Desktop\\renat_test\\Eclipse\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless"))
			{
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			
			
		}
		else if (browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\FLORA\\Desktop\\renat_test\\Eclipse\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//execute in firefox driver
			//driver= new ChromeDriver();
		}
		else if (browserName.equals("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\FLORA\\Desktop\\renat_test\\Eclipse\\InternetExplorerDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//execute in IE driver
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FLORA\\Desktop\\renat_test\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		return driver;
		
		
		
	}
	
	public void getScreenshot(String result) throws IOException 
	{
		Date d= new Date();
		SimpleDateFormat  sdf = new SimpleDateFormat("yyMMddHHmmssZ");
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("//C://Users//FLORA//Desktop//renat_test//ScreenShots//"+sdf.format(d)+result+"screen.png"));
		
		//C://Users//FLORA//Desktop//renat_test//ScreenShots//screen.png
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
