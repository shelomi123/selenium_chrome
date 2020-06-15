import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scope {

public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//calculate links on page
		System.out.println(driver.findElements(By.tagName("a")).size());
	
		//calculate links only in footer
		//To limit scope creating minidriver
		WebElement minidriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(minidriver.findElements(By.tagName("a")).size());
		
		//To limit scope again creating another driver under minidriver
		WebElement microdriver = minidriver.findElement(By.xpath("//table/tbody/tr[1]/td/ul"));
		System.out.println(microdriver.findElements(By.tagName("a")).size());
		
		//click all links inside microdriver
		for(int i=1;i<microdriver.findElements(By.tagName("a")).size();i++) {
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			microdriver.findElements(By.tagName("a")).get(i).sendKeys("cliclOnLink");
			Thread.sleep(8000L);
		}
		
	}
}
