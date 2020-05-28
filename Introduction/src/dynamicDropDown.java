import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicDropDown {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://spicejet.com");
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		
		
		
		
	}
}
