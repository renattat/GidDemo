package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='LoginForm_username']");
	By password=By.xpath("//input[@id='LoginForm_password']");
	By login=By.xpath("//input[@name='yt0']");
	


	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("newlineCODE1");
		System.out.println("newlineCODE2");
		System.out.println("newlineCODE3");
		
		this.driver=driver;
	}



	public WebElement getEmail()
	{
		System.out.println("OneMoreChange");
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
}
