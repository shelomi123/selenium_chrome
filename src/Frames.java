import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frames {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
		
		WebElement box = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
	
		Actions a = new Actions(driver);
		a.dragAndDrop(box, target).build().perform();
		
		// frame path :   //div[@id='content']/iframe
	}
}
