package POM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.PageRepo.RediffSignPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseRediffLoginPage {
	
	@Test
	public void firstClass()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		RediffSignPage obj = new RediffSignPage(driver);
		
		driver.get("https://www.rediff.com/");
		
		obj.clickOnSign().click();
		
		
		
	}

}
