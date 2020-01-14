package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePage {
	
	public WebDriver driver;
	
	private By searchBox=By.xpath("//div[@class='errorMessage']");
	
	
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	
	public WebElement getSearchBox()
	{
	
		return driver.findElement(searchBox);
	}
	
	
}
