package POM.PageRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffSignPage {
	
	
	
	WebDriver driver;
	
	public RediffSignPage(WebDriver driver)
	{
		this.driver = driver;		//to initalise the webdriver is must to call the method from this call
			PageFactory.initElements(driver,this);
	}
	
	
	
	//By SigninButton = By.xpath("//a[@title='Already a user? Sign in']");
	
	//Or we fan write the code as Page Object Factory
	
	@FindBy(xpath="//a[@title='Already a user? Sign in']")
	WebElement SigninButton;
	
	
	
	
	
//	public WebElement clickOnSign()
//	{
//		
//		return driver.findElement(SigninButton);
//		
//	}
	
	public WebElement clickOnSign()
	{
		
		return SigninButton;
		
	}
	

}
