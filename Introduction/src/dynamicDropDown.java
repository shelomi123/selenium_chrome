import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicDropDown {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		//this xpath shows two elements so select the second xpath
		driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
		
		
		/*
		 from Xpath =  //input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
		 GOA Xpath =  //input[@value='GOI']
		 
		 */
		
		
		
	}
}
