import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driveFirefox {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
		
	}
}
