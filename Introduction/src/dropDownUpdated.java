import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownUpdated {

	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		try {
			Thread.sleep(2000L);
			Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			s1.deselectByValue("6");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByIndex(6);
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByIndex(3);
		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByIndex(5);
	}
}
