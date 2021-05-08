import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class Sahayog {
	
	
	static WebDriver d=	BaseClass.callDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		d.get("https://sahayog.uknowva.com/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.id("username")).sendKeys("2726");
		 d.findElement(By.id("password")).sendKeys("Mango@1234");
		 d.findElement(By.xpath("//form[@id='form-login']/div[1]/button[1]")).click();
		 
		 //Enter in Sahayog
		 
		 d.findElement(By.xpath("//a[@id='NjEw']")).click();
		
		//password.sendKeys("Mango@1234");
		
		//password.sendKeys("Keys.ENTER");
		
		
	
		
		
		

	}

}
