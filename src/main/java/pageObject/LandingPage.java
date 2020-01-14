package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	
	By signin=By.xpath("//a[@id='login-button']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	



	public WebElement getLogin()
	{
		System.out.println("newline1");
		System.out.println("newline2");
		System.out.println("newline3");
		//
		
		//
		System.out.println("newline4");
		System.out.println("newline5");
		System.out.println("newline6");
		
		//
		System.out.println("NewApp1");
		System.out.println("NewApp2");
		System.out.println("NewApp3");
		System.out.println("NewApp4");
		
		return driver.findElement(signin);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	
}











