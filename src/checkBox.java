import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkBox {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement a = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		a.click();
		System.out.println(a.isSelected());
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
	}
}
