import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scope {

public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//calculate links on page
		System.out.println(driver.findElements(By.tagName("a")).size());
	
		//calculate links only in footer
		WebElement minidriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(minidriver.findElements(By.tagName("a")).size());
		
	}
}
