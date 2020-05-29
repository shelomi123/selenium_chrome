//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/*driver.get("https://login.salesforce.com/?locale=eu");
		//driver.findElement(By.className("gb_g")).click();
		
		driver.findElement(By.cssSelector("#username")).sendKeys("shelomi"); //In chrome right click and copy selector
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //right click and copy xpath
		*/
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("shelomi");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		System.out.println(((WebElement) driver.findElements(By.cssSelector("#error"))).getText());
		
	}

}
