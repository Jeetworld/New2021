import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdown {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement ele= d.findElement(By.id("select-demo"));
		
		Select sel = new Select(ele);
		
		sel.selectByValue("Monday");
		
		List<WebElement> list = d.findElements(By.xpath("//*[@id= 'select-demo']/option"));		//to store only those whoes options values parent is id = 
		
		System.out.println(list.size());
		
		for(WebElement link : list)
		{
			
			System.out.println(link.getText());		//1 method to print the text
			
		}
		
		for(int i = 0; i<list.size() ; i++)
		{
			
			System.out.println(list.get(i).getAttribute("value"));		//2nd method to print the text
			
		}
		
		List<WebElement> listOfAllLinks = d.findElements(By.tagName("a"));
		
		for(WebElement link : listOfAllLinks)
		{
			System.out.println(link.getText());		//to print all the links on the webpage
			
			
			
		}
		
		
		
		
		
		
	}

}
