import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;



public class JavaMailSent {
	
	
	
	
	 static WebDriver d=	BaseClass.callDriver();

	public static void main(String[] args) throws IOException, AddressException, MessagingException {
		// TODO Auto-generated method stub
		
d.get("https://sahayog.uknowva.com/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.id("username")).sendKeys("2726");
		 d.findElement(By.id("password")).sendKeys("Mango@1234");
		 d.findElement(By.xpath("//form[@id='form-login']/div[1]/button[1]")).click();
		 
		 //Date d = new Date();
			//String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
			
			System.out.println(System.getProperty("user.dir"));
			
			File screenshot = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
			// Copy the element screenshot to disk
			File screenshotLocation = new File(System.getProperty("user.dir")+"//screenshot//"+"Element_"+".jpg");
			FileUtils.copyFile(screenshot, screenshotLocation);
			
			
			//now mail sent code
			
			MonitoringMail mail = new MonitoringMail();
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		}

			
			

	}



