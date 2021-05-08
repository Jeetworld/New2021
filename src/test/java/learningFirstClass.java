import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learningFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		
		
		d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		d.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iPhoneXR");
		
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		  js.executeScript("window.scrollBy(0,100)");
		
		
		
		System.out.println("End COmpleteion");
		
		

	}

}
