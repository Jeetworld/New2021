import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningResizzable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/resizable/default.html");
		
		/*WebElement resizable = d.findElement(By.id("resizable"));
		
		Actions action = new Actions(d);
		action.dragAndDropBy(resizable,500,400).perform(); */
		
		WebElement resizable = d.findElement(By.xpath("/html/body/div/div[3]"));
		
		Actions action = new Actions(d);
		action.dragAndDropBy(resizable, 400, 500).perform();
	}

}
