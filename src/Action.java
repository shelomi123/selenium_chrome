import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		WebElement move= driver.findElement(By.id("nav-link-accountList"));
		WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		a.moveToElement(move).contextClick().build().perform();
		a.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
		
		
		
	}
}
