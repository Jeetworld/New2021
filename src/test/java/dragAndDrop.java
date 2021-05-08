import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.BaseClass;

public class dragAndDrop extends BaseClass {
	
	
	 static WebDriver d=	BaseClass.callDriver();
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		d.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		//d.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement source = d.findElement(By.xpath("//div[@id='todrag']/span[1]"));
		
		WebElement destination = d.findElement(By.xpath("//div/div[@id='mydropzone']"));
		
		Actions action = new Actions(d);
		action.dragAndDrop(source, destination).build().perform();

	}

}
