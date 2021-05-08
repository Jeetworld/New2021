import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learningSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		
		//d.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		d.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		
		WebElement slider = d.findElement(By.id("slider"));
		
		Actions action = new Actions(d);
		action.dragAndDropBy(slider,400, 0).perform();		//dragandDropBy is to drag the elements to any point in x and y axis. draganddrop is to drag the element from source to destination
		
		
		
	}

}
